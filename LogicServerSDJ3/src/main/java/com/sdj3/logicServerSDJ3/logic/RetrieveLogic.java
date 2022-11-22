package com.sdj3.logicServerSDJ3.logic;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.RetrieveInfoGrpcInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.RetrieveLogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.*;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RetrieveLogic implements RetrieveLogicInterface {
    private RetrieveInfoGrpcInterface client;

    public RetrieveLogic(RetrieveInfoGrpcInterface client) {
        this.client = client;
    }

    @Override
    public ArrayList<ReturnProductDto> getAllProductFromAnimal(int id) {
        return client.getAllProductFromAnimal(id);
    }

    @Override
    public ArrayList<Animal> getAnimalFromProduct(int id) {
        return client.getAnimalFromProduct(id);
    }

    @Override
    public ArrayList<Animal> getAllAnimals() {
        return client.getAllAnimals();
    }

    @Override
    public Animal getAnimalById(int id) {
        return client.getAnimalById(id);
    }

    @Override
    public ArrayList<ReturnTrayDto> getAllTrays() {
        return client.getAllTrays();
    }

    @Override
    public ArrayList<ReturnPartDto> getAllPartsInTray(int id) {
        return client.getAllPartsInTray(id);
    }
}
