package com.sdj3.dataServerSDJ3.Model;


import com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage;
import lombok.Data;

import java.util.Date;
@Data
public class Animal {

    private int id;
    private String origen;
    private double weight;
    private Date arrivedDate;

    public Animal(int id, String origen, double weight, Date arrivedDate) {
        this.id = id;
        this.origen = origen;
        this.weight = weight;
        this.arrivedDate = arrivedDate;
    }

    public Animal(String origen, double weight, Date arrivedDate) {
        this.origen = origen;
        this.weight = weight;
        this.arrivedDate = arrivedDate;
    }

    public Animal(int id, String origen, double weight) {
        this.id = id;
        this.origen = origen;
        this.weight = weight;
    }

   public AnimalMessage buildAnimalMessage()
    {
        return AnimalMessage.newBuilder().setId(id).setOrigen(origen).setWeight(weight).setArrivedDate(arrivedDate.toString()).build();
    }
}
