package com.sdj3.logicserversdj3.share.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private double weight;

    private List<Part> parts;

    public Product(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

}
