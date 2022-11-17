package com.sdj3.dataServerSDJ3.share.entity;

import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double weight;
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Part> parts= new HashSet<>();

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
