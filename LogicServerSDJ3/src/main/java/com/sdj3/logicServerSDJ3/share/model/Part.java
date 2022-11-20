package com.sdj3.logicServerSDJ3.share.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class Part {

    private int id;
    private String name;
    private double weight;
    private Animal animalId;

    public Part(int id,String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.id=id;
    }

}
