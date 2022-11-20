package com.sdj3.dataServerSDJ3.share.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double weight;
    @ManyToOne
    private Tray tray;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Animal animal;

    public Part(String name, double weight,Tray tray, Animal animal) {
        this.name = name;
        this.weight = weight;
        this.tray = tray;
        this.animal = animal;
    }
}
