package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.dataServerSDJ3.protobuf.retrieveInfoProtobuf.*;
import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.RetrieveInfoGrpcInterface;
import com.sdj3.logicServerSDJ3.share.dtos.*;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class RetrieveInfoGrpcImp implements RetrieveInfoGrpcInterface {

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
    private RetrieveServiceGrpc.RetrieveServiceBlockingStub stub = RetrieveServiceGrpc.newBlockingStub(channel);


    @Override
    public ArrayList<ReturnProductDto> getAllProductFromAnimal(int animalId) {
       AnimalIdMessage id = AnimalIdMessage.newBuilder().setId(animalId).build();
        ListProduct listProducts = stub.getAllProductFromAnimal(id);
        ArrayList<ReturnProductDto> dtos = new ArrayList<>();
        for (ProductMessage p:listProducts.getProductMessageList()) {
            ReturnProductDto productDto = new ReturnProductDto();
            productDto.setProductId(p.getId());
            productDto.setProductName(p.getName());
            productDto.setWeight(p.getWeight());
            dtos.add(productDto);
        }
        return dtos;

    }

    @Override
    public  ArrayList<Animal> getAnimalFromProduct(int productId) {
        ProductIdMessage id =ProductIdMessage.newBuilder().setId(productId).build();
        ListAnimals listAnimals = stub.getAnimalFromProduct(id);
        return getAnimals(listAnimals);
    }

    @Override
    public  ArrayList<Animal> getAllAnimals() {
        ListAnimals listAnimals = stub.getAllAnimals(EmptyMessage.getDefaultInstance());

        return getAnimals(listAnimals);
    }

    private  ArrayList<Animal> getAnimals(ListAnimals listAnimals) {
        ArrayList<Animal> animals =new ArrayList<>();
        for (AnimalMessage a:listAnimals.getAnimalMessageList()) {
            Animal animal =new Animal(a.getId(),a.getOrigen(),a.getWeight(), Date.valueOf(a.getArrivedDate()));
            animals.add(animal);
        }
        return animals;
    }

    @Override
    public Animal getAnimalById(int animalId) {
        AnimalIdMessage id = AnimalIdMessage.newBuilder().setId(animalId).build();
        AnimalMessage a =stub.getAnimalById(id);
        return new Animal(a.getId(),a.getOrigen(),a.getWeight(), Date.valueOf(a.getArrivedDate()));
    }

    @Override
    public  ArrayList<ReturnTrayDto> getAllTrays() {
        ListTray listTray =stub.getAllTrays(EmptyMessage.getDefaultInstance());
        ArrayList<ReturnTrayDto> dtoList =new ArrayList<>();
        for (TrayMessage t:listTray.getTrayMessageList()) {
            ReturnTrayDto dto =new ReturnTrayDto(t.getId(),t.getName(),t.getMaxWeight());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public  ArrayList<ReturnPartDto> getAllPartsInTray(int trayId) {
        TrayIdMessage id =TrayIdMessage.newBuilder().setId(trayId).build();
        ListParts parts = stub.getAllPartsInTray(id);
        ArrayList<ReturnPartDto> list= new ArrayList<>();
        for (PartMessage p:parts.getPartMessageList()) {
            ReturnPartDto dto = new ReturnPartDto(p.getPartId(),p.getName(), p.getWeight());
            list.add(dto);
        }
        return list;

    }
}
