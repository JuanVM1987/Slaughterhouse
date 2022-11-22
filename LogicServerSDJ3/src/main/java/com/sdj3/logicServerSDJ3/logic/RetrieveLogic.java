package com.sdj3.logicServerSDJ3.logic;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.RetrieveGrpcInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.RetrieveLogicInterface;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Product;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RetrieveLogic implements RetrieveLogicInterface {
    private RetrieveGrpcInterface client;

    public RetrieveLogic(RetrieveGrpcInterface client) {
        this.client = client;
    }

    @Override
    public ArrayList<Product> getAllProductFromAnimal(int id) {
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
    public ArrayList<Tray> getAllTrays() {
        return client.getAllTrays();
    }

    @Override
    public ArrayList<Part> getAllPartsInTray(int id) {
        return client.getAllPartsInTray(id);
    }
}
