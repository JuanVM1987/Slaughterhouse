package com.sdj3.logicServerSDJ3.logic;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station1GrpcInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.Station1LogicInterface;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import org.springframework.stereotype.Service;

@Service
public class Station1Logic implements Station1LogicInterface {
    private Station1GrpcInterface client;

    public Station1Logic(Station1GrpcInterface client) {
        this.client = client;
    }

    @Override
    public Animal registerAnimal(Animal animal) {
        return client.registerAnimal(animal) ;
    }
}
