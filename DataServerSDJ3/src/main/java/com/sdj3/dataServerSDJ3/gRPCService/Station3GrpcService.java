package com.sdj3.dataServerSDJ3.gRPCService;


import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.ProductDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.protobuf.station3Protobuf.PartMessage;
import com.sdj3.dataServerSDJ3.protobuf.station3Protobuf.ProductMessage;
import com.sdj3.dataServerSDJ3.protobuf.station3Protobuf.ReplayProductMessage;
import com.sdj3.dataServerSDJ3.protobuf.station3Protobuf.Station3ServiceGrpc;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Product;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

@GRpcService
public class Station3GrpcService extends Station3ServiceGrpc.Station3ServiceImplBase {
    private final ProductDAO productDAO;
    private final PartDAO partDAO;
    private TrayDAO trayDAO;

    @Autowired
    public Station3GrpcService(ProductDAO productDAO, PartDAO partDAO, TrayDAO trayDAO) {

        this.productDAO = productDAO;
        this.partDAO = partDAO;
        this.trayDAO = trayDAO;
    }

    @Override
    public void createProduct(ProductMessage request, StreamObserver<ReplayProductMessage> responseObserver) {
        List<Integer>listId= new ArrayList<>();

        //get partId
        request.getPartIdMessageList().forEach(p->listId.add(p.getPartId()));

        //find all parts in product
        Optional<List<Part>> partList = Optional.of(partDAO.findAllById(listId));

        for (Part p:partList.get()) {
            if (p.getProduct()!=null){
                handlerStatus("Part Id: "+ p.getId()+" is not in the tray",responseObserver);
                return;
            }
        }

     if (partList.get().size()!=listId.size()){

            handlerStatus("partId not exist",responseObserver);
            return;
        }

        //calculate te total product weight

        double productWeight=0;

        for (Part p:partList.get()) {
            productWeight +=p.getWeight();
        }
        //Round 2 decimal
        BigDecimal bd = new BigDecimal(productWeight).setScale(2, RoundingMode.HALF_UP);

        Set<Part> partSet = new HashSet<>(partList.get());
        Product product = productDAO.save(new Product(request.getName(),productWeight,partSet));
        partList.get().forEach(l->l.setProduct(product));
        partDAO.saveAll(partList.get());
       ReplayProductMessage.Builder replay= ReplayProductMessage.newBuilder().setId(product.getId()).setName(product.getName())
               .setWeight(bd.doubleValue());

       List<PartMessage> partMessageList=new ArrayList<>();

        for (Part p:partList.get()) {
            PartMessage   partMessage = PartMessage.newBuilder().setName(p.getName())
                    .setId(p.getId()).setWeight(p.getWeight()).build();

            partMessageList.add(partMessage);
        }
        replay.addAllPartMessage(partMessageList);
        responseObserver.onNext(replay.build());
        responseObserver.onCompleted();
    }
    public void handlerStatus(String msg, StreamObserver<ReplayProductMessage> response) {
        Status status = Status.FAILED_PRECONDITION.withDescription(msg);

        response.onError(status.asRuntimeException());
    }


}