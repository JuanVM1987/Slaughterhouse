package com.sdj3.logicServerSDJ3.gRPCconnection.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.model.Animal;

public interface AnimalGrpcInterface {

    Animal registerAnimal(Animal animal);
}
