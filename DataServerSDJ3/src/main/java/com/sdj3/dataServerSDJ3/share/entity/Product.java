package com.sdj3.dataServerSDJ3.share.entity;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double weight;
    @OneToMany(
            mappedBy = "product"
    )
    private Set<Part> parts = new HashSet<>();

    public Product(String name, double weight, Set<Part> partList) {
        parts = partList;
        this.name = name;
        this.weight = weight;
    }

}
