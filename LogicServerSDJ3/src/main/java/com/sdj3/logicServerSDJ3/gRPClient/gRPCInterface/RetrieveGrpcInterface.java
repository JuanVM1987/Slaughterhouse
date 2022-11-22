package com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.model.*;


import java.util.ArrayList;

public interface RetrieveGrpcInterface {
    ArrayList<Product> getAllProductFromAnimal(int id);
    ArrayList<Animal> getAnimalFromProduct(int id);
    ArrayList<Animal>  getAllAnimals();
    Animal getAnimalById(int id);
    ArrayList<Tray> getAllTrays();
    ArrayList<Part> getAllPartsInTray(int id);
}
