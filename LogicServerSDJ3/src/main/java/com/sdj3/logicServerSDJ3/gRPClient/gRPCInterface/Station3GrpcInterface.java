package com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreateProductDto;
import com.sdj3.logicServerSDJ3.share.model.Product;

public interface Station3GrpcInterface {
    Product createProduct(CreateProductDto productDto);
}
