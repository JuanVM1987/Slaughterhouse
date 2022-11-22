package com.sdj3.logicServerSDJ3.logic.logicInterface;

import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Product;
import com.sdj3.logicServerSDJ3.share.model.Tray;

import java.util.ArrayList;

public interface RetrieveLogicInterface {

    ArrayList<Product> getAllProductFromAnimal(int id);
    ArrayList<Animal> getAnimalFromProduct(int id);
    ArrayList<Animal>  getAllAnimals();
    Animal getAnimalById(int id);
    ArrayList<Tray> getAllTrays();
    ArrayList<Part> getAllPartsInTray(int id);
}
