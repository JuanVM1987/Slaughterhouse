package com.sdj3.dataServerSDJ3.gRPCConnection;

import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage;
import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage;
import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartServiceGrpc;
import com.sdj3.dataServerSDJ3.services.serviceInterface.PartServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class PartGrpcConnection extends PartServiceGrpc.PartServiceImplBase {


    private final PartServiceInterface partService;

    @Autowired
    public PartGrpcConnection(PartServiceInterface partService) {

        this.partService = partService;
    }

   @Override
    public void creatPart(AddPartMessage request, StreamObserver<PartMessage> response){

       Part part1 =new Part(request.getName(),request.getWeight(),new Tray(),new Animal());
       part1.getAnimal().setId(request.getAnimalId());
       part1.getTray().setId(request.getTrayId());
       Part part = partService.addPart(part1);
        PartMessage reply = PartMessage.newBuilder().setId(part.getId()).setName(part.getName())
                .setWeight(part.getWeight()).setTrayId(part.getTray().getId())
                .setAnimalId(part.getAnimal().getId()).build();
       response.onNext(reply);
       response.onCompleted();

    }


}
