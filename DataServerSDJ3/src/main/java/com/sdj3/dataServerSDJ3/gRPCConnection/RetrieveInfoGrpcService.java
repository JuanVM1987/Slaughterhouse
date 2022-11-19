package com.sdj3.dataServerSDJ3.gRPCConnection;

import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;

import com.sdj3.dataServerSDJ3.protobuf.retrieveInfoProtobuf.RetrieveServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class RetrieveInfoGrpcService extends RetrieveServiceGrpc.RetrieveServiceImplBase {

    private final TrayDAO trayDAO;


    @Autowired
    public RetrieveInfoGrpcService(TrayDAO trayDAO) {
        this.trayDAO = trayDAO;

    }


   /* @Override
    public void getAllProductFromAnimal(RetrieveAnimalMessage request, StreamObserver<ListProduct> responseObserver){
        System.out.println("Received Request =========>"+ request.toString());

        Animal animal = new Animal(request.getId(),request.getOrigen(),request.getWeight());

        List<Product> productList=productDAO.allProductComingFromSameAnimal(animal);
        ListProduct.Builder builder =ListProduct.newBuilder();
        for (Product p:productList) {
            builder.addProductMessage(p.buildAnimalMessage());
        }
        ListProduct reply = builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
*/

}
