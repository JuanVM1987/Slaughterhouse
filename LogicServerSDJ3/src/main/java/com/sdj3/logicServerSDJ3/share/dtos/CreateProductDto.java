package com.sdj3.logicServerSDJ3.share.dtos;

import com.sdj3.logicServerSDJ3.share.model.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CreateProductDto {
    private String name;
    private List<Integer> partId;


}
