package com.sdj3.dataServerSDJ3.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Tray {
    private int id;
    private String name;
    private int max_weight;
    private List<Part> parts;

    public Tray(String name, int max_weight) {
        this.name = name;
        this.max_weight = max_weight;
    }
}
