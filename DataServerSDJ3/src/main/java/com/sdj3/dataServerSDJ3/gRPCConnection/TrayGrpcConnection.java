package com.sdj3.dataServerSDJ3.gRPCConnection;

import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.services.serviceInterface.TrayServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.CreateTrayMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.ReturnMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.TrayServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class TrayGrpcConnection extends TrayServiceGrpc.TrayServiceImplBase {

    private final TrayServiceInterface trayService;


    @Autowired
    public TrayGrpcConnection(TrayServiceInterface trayService) {
        this.trayService = trayService;
    }


   @Override
    public void createTray(CreateTrayMessage request, StreamObserver<ReturnMessage> responseObserver) {
        System.out.println("Received Request =========>"+ request.toString());

        Tray tray = new Tray(request.getName(),request.getMaxWeight());

           String msg = trayService.createTray(tray);

          ReturnMessage reply= ReturnMessage.newBuilder().setMessage(msg).build();
          responseObserver.onNext(reply);
          responseObserver.onCompleted();

    }

}
