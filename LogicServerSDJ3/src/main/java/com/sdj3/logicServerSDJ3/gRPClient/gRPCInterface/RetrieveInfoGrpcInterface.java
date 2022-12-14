package com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.dtos.ReturnPartDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnProductDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnTrayDto;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;

import java.util.ArrayList;
import java.util.List;

public interface RetrieveInfoGrpcInterface {

    ArrayList<ReturnProductDto> getAllProductFromAnimal(int animalId);
    ArrayList<Animal> getAnimalFromProduct(int productId);
    ArrayList<Animal> getAllAnimals();
    Animal getAnimalById(int animalId);
    ArrayList<ReturnTrayDto> getAllTrays();
    ArrayList<ReturnPartDto>getAllPartsInTray(int trayId);
}
