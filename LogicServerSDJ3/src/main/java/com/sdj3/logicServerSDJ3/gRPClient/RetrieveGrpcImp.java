package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.dataServerSDJ3.protobuf.retrieveInfoProtobuf.*;
import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.RetrieveGrpcInterface;
import com.sdj3.logicServerSDJ3.share.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class RetrieveGrpcImp implements RetrieveGrpcInterface {
    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
    private RetrieveServiceGrpc.RetrieveServiceBlockingStub stub = RetrieveServiceGrpc.newBlockingStub(channel);


    public ArrayList<Product> getAllProductFromAnimal(int id){
        AnimalIdMessage idMessage= AnimalIdMessage.newBuilder().setId(id).build();
        ListProduct listProduct= stub.getAllProductFromAnimal(idMessage);
       ArrayList<Product> products= new ArrayList<>();
        for (ProductMessage p: listProduct.getProductMessageList()
             ) {
            Product product= new Product(p.getId(),p.getName(),p.getWeight());
            products.add(product);
        }
        return products;



    }

    @Override
    public ArrayList<Animal> getAnimalFromProduct(int id) {
        ProductIdMessage request = ProductIdMessage.newBuilder().setId(id).build();
        ListAnimals replay= stub.getAnimalFromProduct(request);
        ArrayList<Animal> animals= new ArrayList<>();
        for (AnimalMessage m:replay.getAnimalMessageList()
             ) {
            Animal animal= new Animal(m.getId(),m.getOrigen(),m.getWeight(), Date.valueOf(m.getArrivedDate()));
            animals.add(animal);

        }
        return animals;
    }

    @Override
    public ArrayList<Animal> getAllAnimals() {
        EmptyMessage request= EmptyMessage.newBuilder().build();
        ListAnimals replay= stub.getAllAnimals(request);
        ArrayList<Animal> animals= new ArrayList<>();

        for (AnimalMessage m:replay.getAnimalMessageList()
             ) {
            Animal animal= new Animal(m.getId(),m.getOrigen(),m.getWeight(),Date.valueOf(m.getArrivedDate()));
            animals.add(animal);

        }
        return animals;

    }

    @Override
    public Animal getAnimalById(int id) {
        AnimalIdMessage request= AnimalIdMessage.newBuilder().setId(id).build();
        AnimalMessage replay=stub.getAnimalById(request);

        return new Animal(replay.getId(),replay.getOrigen(),replay.getWeight(),Date.valueOf(replay.getArrivedDate()));
    }

    @Override
    public ArrayList<Tray> getAllTrays() {
        EmptyMessage request= EmptyMessage.newBuilder().build();
        ListTray replay= stub.getAllTrays(request);
        ArrayList<Tray> trays= new ArrayList<>();
        for (TrayMessage m:replay.getTrayMessageList()
             ) {
            Tray tray= new Tray(m.getId(),m.getName(),m.getMaxWeight(),getAllPartsInTray(m.getId()));
            trays.add(tray);
        }
        return trays;
    }

    @Override
    public ArrayList<Part> getAllPartsInTray(int id) {
        TrayIdMessage request= TrayIdMessage.newBuilder().setId(id).build();
        ListParts replay= stub.getAllPartsInTray(request);
        ArrayList<Part> parts= new ArrayList<>();
        for (PartMessage m:replay.getPartMessageList()
             ) {
            Part part= new Part(m.getPartId(),m.getName(),m.getWeight());
            parts.add(part);

        }
        return parts;
    }
}
