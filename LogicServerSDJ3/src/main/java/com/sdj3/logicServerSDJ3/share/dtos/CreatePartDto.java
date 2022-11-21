package com.sdj3.logicServerSDJ3.share.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreatePartDto {

    private String name;
    private double weight;
    private int animalId;
    private int trayId;
}
