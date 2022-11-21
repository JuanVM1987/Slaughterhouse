package com.sdj3.logicServerSDJ3.share.dtos;

import com.sdj3.logicServerSDJ3.share.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class ReturnProductDto {
    private int productId;
    private String productName;
    private double weight;
}
