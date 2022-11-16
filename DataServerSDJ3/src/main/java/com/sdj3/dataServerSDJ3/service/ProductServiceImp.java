package com.sdj3.dataServerSDJ3.service;


import com.sdj3.dataServerSDJ3.DAOs.ProductImp;
import com.sdj3.dataServerSDJ3.DAOs.interfaceDao.IProductDAO;
import com.sdj3.dataServerSDJ3.Model.Animal;
import com.sdj3.dataServerSDJ3.Model.Product;
import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.AnimalMessage;
import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct;
import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.sql.SQLException;
import java.util.List;
@GRpcService
public class ProductServiceImp extends ProductServiceGrpc.ProductServiceImplBase {
 private IProductDAO productDAO = ProductImp.getInstance();

    public ProductServiceImp() throws SQLException {

    }


    @Override
    public void getAllProductFromAnimal(AnimalMessage request, StreamObserver<ListProduct> responseObserver){
        System.out.println("Received Request =========>"+ request.toString());

        Animal animal = new Animal(request.getId(),request.getOrigen(),request.getWeight());

        List<Product> productList=productDAO.allProductComingFromSameAnimal(animal);
        ListProduct.Builder builder =ListProduct.newBuilder();
        for (Product p:productList) {
            builder.addProductMessage(p.buildAnimalMessage());
        }
        ListProduct reply = builder.build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}