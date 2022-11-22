package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.dataServerSDJ3.protobuf.station3Protobuf.*;
import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station3GrpcInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreateProductDto;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Product;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Station3GrpcImp implements Station3GrpcInterface {
   private final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
   private final Station3ServiceGrpc.Station3ServiceBlockingStub stub = Station3ServiceGrpc.newBlockingStub(channel);


   @Override
   public Product createProduct(CreateProductDto productDto){

      ProductMessage.Builder builder  = ProductMessage.newBuilder().setName(productDto.getName());

      List<PartIdMessage> partMessageList=new ArrayList<>();
      for (int p: productDto.getPartId()) {
         PartIdMessage pId = PartIdMessage.newBuilder().setPartId(p).build();
         partMessageList.add(pId);
      }
      builder.addAllPartIdMessage(partMessageList).build();

      ReplayProductMessage replay = stub.createProduct(builder.build());
      List<Part> newList =new ArrayList<>();

      for (PartMessage p:replay.getPartMessageList()) {

         Part part =new Part(p.getId(),p.getName(), p.getWeight());
         newList.add(part);
      }

      return new Product(replay.getId(), replay.getName(), replay.getWeight(),newList);
   }


}
