package com.sdj3.dataServerSDJ3.gRPCConnection;

import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.CreateTrayMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.ReturnMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.TrayServiceGrpc;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class TrayGrpcConnection extends TrayServiceGrpc.TrayServiceImplBase {

    private final TrayDAO trayDAO;


    @Autowired
    public TrayGrpcConnection(TrayDAO trayDAO) {
        this.trayDAO = trayDAO;

    }


    @Override
    public void createTray(CreateTrayMessage request, StreamObserver<ReturnMessage> responseObserver) {
        Tray tray = new Tray(request.getName(), request.getMaxWeight());
        Tray tray1 = trayDAO.save(tray);

        String msg = "Successfully add a tray with id: " + tray1.getId();
        ReturnMessage reply = ReturnMessage.newBuilder().setMessage(msg).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

}
