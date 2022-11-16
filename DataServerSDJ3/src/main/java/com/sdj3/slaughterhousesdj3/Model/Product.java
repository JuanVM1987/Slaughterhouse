package com.sdj3.slaughterhousesdj3.Model;

import com.sdj3.slaughterhousesdj3.protobuf.productProtobuf.ProductMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double weight;

    public ProductMessage buildAnimalMessage()
    {
        return ProductMessage.newBuilder().setId(id).setName(name).setWeight(weight).build();
    }
}
