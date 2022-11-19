package com.sdj3.dataServerSDJ3.share.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double weight;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tray tray;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Animal animal;

    public Part(String name, double weight, Tray tray, Animal animal) {
        this.name = name;
        this.weight = weight;
        this.tray = tray;
        this.animal = animal;
    }
}
