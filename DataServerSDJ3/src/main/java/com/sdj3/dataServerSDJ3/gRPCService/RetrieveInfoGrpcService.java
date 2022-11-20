package com.sdj3.dataServerSDJ3.gRPCService;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.ProductDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;

import com.sdj3.dataServerSDJ3.protobuf.retrieveInfoProtobuf.*;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Product;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class RetrieveInfoGrpcService extends RetrieveServiceGrpc.RetrieveServiceImplBase {

    private final ProductDAO productDAO;
    private final PartDAO partDAO;
    private TrayDAO trayDAO;
    private final AnimalDAO animalDAO;


    @Autowired
    public RetrieveInfoGrpcService(ProductDAO productDAO, PartDAO partDAO, TrayDAO trayDAO, AnimalDAO animalDAO) {
        this.productDAO = productDAO;
        this.partDAO = partDAO;
        this.trayDAO = trayDAO;
        this.animalDAO = animalDAO;
    }



    @Override
    public void getAllProductFromAnimal(AnimalIdMessage request, StreamObserver<ListProduct> responseObserver){
        int animalId=request.getId();

        List<Product> productList=productDAO.getAllProductsFromAnimal(animalId);
        ListProduct.Builder builder =ListProduct.newBuilder();
        for (Product p:productList) {
            builder.addProductMessage(ProductMessage.newBuilder().setId(p.getId()).setName(p.getName())
                    .setWeight(p.getWeight()));
        }
        ListProduct reply = builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalFromProduct(ProductIdMessage request, StreamObserver<ListAnimals> responseObserver) {
        int productId= request.getId();
        List<Animal> animalList =animalDAO.getAnimalFromProduct(productId);

        ListAnimals.Builder builder = ListAnimals.newBuilder();

        for (Animal a:animalList) {
            builder.addAnimalMessage(AnimalMessage.newBuilder().setId(a.getId()).setOrigen(a.getOrigen())
                    .setWeight(a.getWeight()).setArrivedDate(String.valueOf(a.getArrivedDate())));
        }
        ListAnimals reply = builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAnimals(EmptyMessage request, StreamObserver<ListAnimals> responseObserver) {

        List<Animal> animalList =animalDAO.findAll();
        ListAnimals.Builder builder = ListAnimals.newBuilder();
        for (Animal a:animalList) {
            builder.addAnimalMessage(AnimalMessage.newBuilder().setId(a.getId()).setOrigen(a.getOrigen())
                    .setWeight(a.getWeight()).setArrivedDate(String.valueOf(a.getArrivedDate())));
        }
        ListAnimals reply = builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

    @Override
    public void getAnimalById(AnimalIdMessage request, StreamObserver<AnimalMessage> responseObserver) {
        super.getAnimalById(request, responseObserver);
    }
}
