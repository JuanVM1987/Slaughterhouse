package com.sdj3.logicServerSDJ3.logic;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station3GrpcInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.Station1LogicInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.Station3LogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.CreateProductDto;
import com.sdj3.logicServerSDJ3.share.model.Product;
import org.springframework.stereotype.Service;

@Service
public class Station3Logic implements Station3LogicInterface {
    private Station3GrpcInterface client;

    public Station3Logic(Station3GrpcInterface client) {
        this.client = client;
    }

    @Override
    public Product createProduct(CreateProductDto dto) {
        return client.createProduct(dto);
    }
}
