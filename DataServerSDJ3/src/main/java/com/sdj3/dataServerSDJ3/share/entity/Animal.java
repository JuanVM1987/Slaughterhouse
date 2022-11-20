package com.sdj3.dataServerSDJ3.share.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String origen;
    @Column(nullable = false)
    private double weight;
    private Date arrivedDate;


    public Animal(String origen, double weight, Date arrivedDate) {
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
