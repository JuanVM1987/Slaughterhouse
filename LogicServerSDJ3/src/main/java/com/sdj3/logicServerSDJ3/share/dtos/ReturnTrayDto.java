package com.sdj3.logicServerSDJ3.share.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReturnTrayDto {
    private int id;
    private String name;
    private int max_weight;

}
