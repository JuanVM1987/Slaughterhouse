package com.sdj3.dataServerSDJ3.gRPCConnection;


import com.sdj3.dataServerSDJ3.DAOs.ProductDAO;
import com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class ProductGrpcConnection extends ProductServiceGrpc.ProductServiceImplBase {
 private ProductDAO productDAO;


    @Autowired
    public ProductGrpcConnection(ProductDAO productDAO)  {

        this.productDAO = productDAO;
    }


   /* @Override
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
*/
}