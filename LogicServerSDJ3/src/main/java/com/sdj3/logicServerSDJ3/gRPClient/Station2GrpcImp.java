package com.sdj3.logicServerSDJ3.gRPClient;

import com.sdj3.dataServerSDJ3.protobuf.station2Protobuf.*;
import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station2GrpcInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import org.springframework.stereotype.Service;

@Service
public class Station2GrpcImp implements Station2GrpcInterface {
   private final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8088).usePlaintext().build();
   private final Station2ServiceGrpc.Station2ServiceBlockingStub stub = Station2ServiceGrpc.newBlockingStub(channel);



    @Override
    public String CreateTray(Tray tray) {
        try {
            TrayMessage create = TrayMessage.newBuilder()
                    .setName(tray.getName()).setMaxWeight(tray.getMax_weight()).build();

            ReturnMessage replay = stub.createTray(create);

            return replay.getMessage();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public CreatePartDto CreatePart(CreatePartDto part) {
        try {
            PartMessage create = PartMessage.newBuilder()
                    .setName(part.getName()).setWeight(part.getWeight()).setAnimalId(part.getAnimalId()).setTrayId(part.getTrayId()).build();

            ReturnPartMessage replay = stub.createPart(create);

            return new CreatePartDto(replay.getName(),replay.getWeight(), replay.getAnimalId(), replay.getTrayId());

        }catch (Exception e){

            Status status = Status.fromThrowable(e);
               throw new RuntimeException(status.getDescription());

        }

    }
}
