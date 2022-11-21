package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.RetrieveInfoGrpcInterface;
import com.sdj3.logicServerSDJ3.protobuf.retrieveInfoProtobuf.*;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnPartDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnProductDto;
import com.sdj3.logicServerSDJ3.share.dtos.ReturnTrayDto;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class RetrieveInfoGrpcImp implements RetrieveInfoGrpcInterface {

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
    private RetrieveServiceGrpc.RetrieveServiceBlockingStub stub = RetrieveServiceGrpc.newBlockingStub(channel);


    @Override
    public List<ReturnProductDto> getAllProductFromAnimal(int animalId) {
       AnimalIdMessage id = AnimalIdMessage.newBuilder().setId(animalId).build();
        ListProduct listProducts = stub.getAllProductFromAnimal(id);
        List<ReturnProductDto> dtos = new ArrayList<>();
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
    public List<Animal> getAnimalFromProduct(int productId) {
        ProductIdMessage id =ProductIdMessage.newBuilder().setId(productId).build();
        ListAnimals listAnimals = stub.getAnimalFromProduct(id);
        return getAnimals(listAnimals);
    }

    @Override
    public List<Animal> getAllAnimals() {
        ListAnimals listAnimals = stub.getAllAnimals(EmptyMessage.getDefaultInstance());

        return getAnimals(listAnimals);
    }

    private List<Animal> getAnimals(ListAnimals listAnimals) {
        List<Animal> animals =new ArrayList<>();
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
    public List<ReturnTrayDto> getAllTrays() {
        ListTray listTray =stub.getAllTrays(EmptyMessage.getDefaultInstance());
        List<ReturnTrayDto> dtoList =new ArrayList<>();
        for (TrayMessage t:listTray.getTrayMessageList()) {
            ReturnTrayDto dto =new ReturnTrayDto(t.getId(),t.getName(),t.getMaxWeight());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public List<ReturnPartDto> getAllPartsInTray(int trayId) {
        TrayIdMessage id =TrayIdMessage.newBuilder().setId(trayId).build();
        ListParts parts = stub.getAllPartsInTray(id);
        List<ReturnPartDto> list= new ArrayList<>();
        for (PartMessage p:parts.getPartMessageList()) {
            ReturnPartDto dto = new ReturnPartDto(p.getPartId(),p.getName(), p.getWeight());
            list.add(dto);
        }
        return list;

    }
}
