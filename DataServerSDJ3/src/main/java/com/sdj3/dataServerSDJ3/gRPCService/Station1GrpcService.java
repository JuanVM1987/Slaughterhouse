package com.sdj3.dataServerSDJ3.gRPCService;


import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;

import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.AnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.RegisterAnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.Station1ServiceGrpc;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Date;

@GRpcService
public class Station1GrpcService extends Station1ServiceGrpc.Station1ServiceImplBase {

    private final AnimalDAO animalDAO;

    @Autowired
    public Station1GrpcService(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;

    }

    @Override
    public void registerAnimal(RegisterAnimalMessage request, StreamObserver<AnimalMessage> responseObserver){

        Animal animal1= animalDAO.save(new Animal(request.getOrigen(),request.getWeight(), Date.valueOf(request.getArrivedDate())));
        AnimalMessage reply = AnimalMessage.newBuilder().setId(animal1.getId()).setOrigen(animal1.getOrigen())
                .setWeight(animal1.getWeight()).setArrivedDate(String.valueOf(animal1.getArrivedDate())).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

}



