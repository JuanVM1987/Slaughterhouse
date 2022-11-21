package com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.dtos.ReturnPartDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnProductDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnTrayDto;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;

import java.util.List;

public interface RetrieveInfoGrpcInterface {

    List<ReturnProductDto> getAllProductFromAnimal(int animalId);
    List<Animal> getAnimalFromProduct(int productId);
    List<Animal> getAllAnimals();
    Animal getAnimalById(int animalId);
    List<ReturnTrayDto> getAllTrays();
    List<ReturnPartDto>getAllPartsInTray(int trayId);
}
