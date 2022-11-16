package com.sdj3.dataServerSDJ3.Model;

import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
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

    public ProductMessage buildAnimalMessage()
    {
        return ProductMessage.newBuilder().setId(id).setName(name).setWeight(weight).build();
    }
}
