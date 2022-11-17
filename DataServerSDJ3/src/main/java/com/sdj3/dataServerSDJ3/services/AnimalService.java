package com.sdj3.dataServerSDJ3.services;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.services.serviceInterface.AnimalServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalService implements AnimalServiceInterface {

    private final AnimalDAO animalDAO;

    @Autowired
    public AnimalService(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    @Override
    public Animal registerAnimal (Animal animal){
       return animalDAO.save(animal);
    }
}
