package com.sdj3.dataServerSDJ3.gRPCConnection;


import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalServiceGrpc;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage;
import com.sdj3.dataServerSDJ3.services.serviceInterface.AnimalServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

@GRpcService
public class AnimalGrpcConnection extends AnimalServiceGrpc.AnimalServiceImplBase {
    private final AnimalServiceInterface animalService;

    @Autowired
    public AnimalGrpcConnection( AnimalServiceInterface animalService) {
        this.animalService = animalService;
    }

    @Override
    public void registerAnimal(RegisterAnimalMessage request, StreamObserver<AnimalMessage> responseObserver){
        Animal animal1= animalService.registerAnimal(new Animal(request.getOrigen(),request.getWeight(), Date.valueOf(request.getArrivedDate())));
        AnimalMessage reply = animal1.buildAnimalMessage();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}
