package com.sdj3.dataServerSDJ3.gRPCConnection;


import com.sdj3.dataServerSDJ3.DAOs.ProductDAO;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class Station3GrpcService {
 private ProductDAO productDAO;


    @Autowired
    public Station3GrpcService(ProductDAO productDAO)  {

        this.productDAO = productDAO;
    }


}