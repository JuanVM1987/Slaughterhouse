package com.sdj3.dataServerSDJ3.share.entity;

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
public class Tray {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int max_weight;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "tray",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Part> parts= new HashSet<>();

    public Tray(String name, int max_weight) {
        this.name = name;
        this.max_weight = max_weight;
    }
}
