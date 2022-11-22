package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.AnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.RegisterAnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.station1Protobuf.Station1ServiceGrpc;
import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station1GrpcInterface;

import com.sdj3.logicServerSDJ3.share.model.Animal;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.sql.Date;


@Service
public class Station1GrpcImp implements Station1GrpcInterface {
  /*  @GrpcClient("station-1")
    private Station1ServiceGrpc.Station1ServiceBlockingStub stub;
    */

   private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
    private Station1ServiceGrpc.Station1ServiceBlockingStub stub = Station1ServiceGrpc.newBlockingStub(channel);

    public Animal registerAnimal(Animal animal) {


        RegisterAnimalMessage register = RegisterAnimalMessage.newBuilder().setOrigen(animal.getOrigen())
                .setWeight(animal.getWeight()).setArrivedDate(String.valueOf(animal.getArrivedDate())).build();

       AnimalMessage animalMessage= stub.registerAnimal(register);
       return new Animal(animalMessage.getId(),animal.getOrigen(),animalMessage.getWeight(), Date.valueOf(animalMessage.getArrivedDate()));


    }
}
