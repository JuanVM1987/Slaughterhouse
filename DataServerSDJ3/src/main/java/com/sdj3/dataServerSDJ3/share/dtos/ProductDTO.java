package com.sdj3.dataServerSDJ3.share.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class ProductDTO {

    private String name;
    private List<Integer> ListIdParts;
}
