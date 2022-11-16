package com.sdj3.dataServerSDJ3.service;



import com.sdj3.dataServerSDJ3.DAOs.AnimalImp;
import com.sdj3.dataServerSDJ3.DAOs.interfaceDao.IAnimalDAO;
import com.sdj3.dataServerSDJ3.Model.Animal;
import com.sdj3.dataServerSDJ3.Model.Product;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@GRpcService
public class AnimalServiceImp extends AnimalServiceGrpc.AnimalServiceImplBase {
    private final IAnimalDAO animalDAO= AnimalImp.getInstance();

    public AnimalServiceImp() throws SQLException {
    }


    @Override
    public void getAnimalFromProduct(ProductMessage request, StreamObserver<ListAnimals> responseObserver) {
        System.out.println("Received Request =========>"+ request.toString());

        Product product =new Product(request.getId(),request.getName(),request.getWeight());

        List<Animal> animalList = animalDAO.getAnimalFromProduct(product);
        ListAnimals.Builder builder = ListAnimals.newBuilder();
        for (Animal a:animalList) {
            builder.addAnimalMessage(a.buildAnimalMessage());
        }
        ListAnimals reply= builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
    @Override
    public void getAllAnimals(EmptyMessage request, StreamObserver<ListAnimals> responseObserver){

        System.out.println("Received Request =========>"+ request.toString());
        List<Animal> animalList = animalDAO.getAllAnimals();
        ListAnimals.Builder builder = ListAnimals.newBuilder();
        for (Animal a:animalList) {
            builder.addAnimalMessage(a.buildAnimalMessage());
        }
        ListAnimals reply= builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
    @Override
    public void getAnimalById(AnimalIdMessage request, StreamObserver<AnimalMessage> responseObserver ){
        System.out.println("Received Request =========>"+ request.toString());
        Animal animal = animalDAO.getAnimalById(request.getId());
        AnimalMessage reply = animal.buildAnimalMessage();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void registerAnimal(RegisterAnimalMessage request, StreamObserver<AnimalMessage> responseObserver){
        System.out.println("Received Request =========>"+ request.toString());

       Animal animal1= animalDAO.RegisterAnima(new Animal(request.getOrigen(),request.getWeight(), Date.valueOf(request.getArrivedDate())));
        AnimalMessage reply = animal1.buildAnimalMessage();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
