package com.sdj3.logicServerSDJ3.logic.logicInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreateProductDto;
import com.sdj3.logicServerSDJ3.share.model.Product;

public interface Station3LogicInterface {
    Product createProduct(CreateProductDto dto);
}
