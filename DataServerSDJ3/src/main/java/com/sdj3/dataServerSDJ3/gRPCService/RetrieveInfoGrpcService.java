package com.sdj3.dataServerSDJ3.gRPCService;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.ProductDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;

import com.sdj3.dataServerSDJ3.protobuf.retrieveInfoProtobuf.*;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Product;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class RetrieveInfoGrpcService extends RetrieveServiceGrpc.RetrieveServiceImplBase {

    private final ProductDAO productDAO;
    private final PartDAO partDAO;
    private final TrayDAO trayDAO;
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
        Optional<Animal> animal =animalDAO.findById(animalId);
        if (animal.isEmpty()){
            Status status = Status.FAILED_PRECONDITION.withDescription("Animal with id : "+animalId+", not found");
            responseObserver.onError(status.asRuntimeException());
            return;
        }
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
        Optional<Product> product = productDAO.findById(productId);
        if (product.isEmpty()){
            Status status = Status.FAILED_PRECONDITION.withDescription("Product with id : "+productId+", not found");
            responseObserver.onError(status.asRuntimeException());
            return;
        }
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
        int animalId = request.getId();
         Optional<Animal> animal=animalDAO.findById(animalId);

         if (animal.isEmpty()){
             Status status = Status.FAILED_PRECONDITION.withDescription("Animal id : "+animalId+", not found");
             responseObserver.onError(status.asRuntimeException());
             return;
         }
         AnimalMessage reply = AnimalMessage.newBuilder().setId(animal.get().getId()).setWeight(animal.get().getWeight())
                 .setOrigen(animal.get().getOrigen()).setArrivedDate(String.valueOf(animal.get().getArrivedDate())).build();

         responseObserver.onNext(reply);
         responseObserver.onCompleted();
    }

    @Override
    public void getAllTrays(EmptyMessage request, StreamObserver<ListTray> responseObserver) {
        List<Tray> trayList = trayDAO.findAll();
        ListTray.Builder builder = ListTray.newBuilder();
        for (Tray t:trayList) {
            builder.addTrayMessage(TrayMessage.newBuilder().setId(t.getId()).setName(t.getName())
                    .setMaxWeight(t.getMax_weight()));
        }

        ListTray reply= builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

    @Override
    public void getAllPartsInTray(TrayIdMessage request, StreamObserver<ListParts> responseObserver) {
        int tryId= request.getId();
        Optional<Tray> tray = trayDAO.findById(tryId);
        if (tray.isEmpty()){
            Status status = Status.FAILED_PRECONDITION.withDescription("Tray id : "+tryId+", not found");
            responseObserver.onError(status.asRuntimeException());
            return;
        }
        List<Part> partList = partDAO.getAllPartsInTray(tryId);
        ListParts.Builder builder = ListParts.newBuilder();
        for (Part p:partList) {
            builder.addPartMessage(PartMessage.newBuilder().setPartId(p.getId())
                    .setName(p.getName()).setWeight(p.getWeight()));
        }
        ListParts reply =builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
