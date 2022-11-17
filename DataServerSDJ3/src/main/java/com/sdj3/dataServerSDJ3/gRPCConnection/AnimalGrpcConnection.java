package com.sdj3.dataServerSDJ3.gRPCConnection;


import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalServiceGrpc;
import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Date;

@GRpcService
public class AnimalGrpcConnection extends AnimalServiceGrpc.AnimalServiceImplBase {

    private final AnimalDAO animalDAO;

    @Autowired
    public AnimalGrpcConnection( AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;

    }

    @Override
    public void registerAnimal(RegisterAnimalMessage request, StreamObserver<AnimalMessage> responseObserver){
        try {
            Animal animal1= animalDAO.save(new Animal(request.getOrigen(),request.getWeight(), Date.valueOf(request.getArrivedDate())));
            AnimalMessage reply = animal1.buildAnimalMessage();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        } catch (DataAccessException e) {
            throw e;
        }

    }

    }



