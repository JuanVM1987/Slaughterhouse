package com.sdj3.logicServerSDJ3.share.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {


    private int id;
    private String origen;
    private double weight;
    private java.sql.Date arrivedDate;


    public Animal(String origen, double weight, java.sql.Date arrivedDate) {
        this.origen = origen;
        this.weight = weight;
        this.arrivedDate = arrivedDate;
    }

    public Animal(int id, String origen, double weight) {
        this.id = id;
        this.origen = origen;
        this.weight = weight;
    }

}
