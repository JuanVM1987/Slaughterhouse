package com.sdj3.logicserversdj3.share.model;


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
    private Tray tray;

    private Product product;

    private Animal animal;

    public Part(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Part(String name, double weight, Tray tray, Animal animal) {
        this.name = name;
        this.weight = weight;
        this.tray = tray;
        this.animal = animal;
    }
}
