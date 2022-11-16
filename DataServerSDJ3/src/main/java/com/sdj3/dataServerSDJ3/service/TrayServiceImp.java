package com.sdj3.dataServerSDJ3.service;

import com.sdj3.dataServerSDJ3.DAOs.TrayImp;
import com.sdj3.dataServerSDJ3.DAOs.interfaceDao.ITrayDAO;
import com.sdj3.dataServerSDJ3.Model.Tray;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.CreateTrayMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.ReturnMessage;
import com.sdj3.dataServerSDJ3.protobuf.TrayProtobuf.TrayServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.sql.SQLException;
@GRpcService
public class TrayServiceImp extends TrayServiceGrpc.TrayServiceImplBase {

    private final ITrayDAO trayDAO= TrayImp.getInstance();;


    public TrayServiceImp() throws SQLException {
    }


    @Override
    public void createTray(CreateTrayMessage request, StreamObserver<ReturnMessage> responseObserver) {
        System.out.println("Received Request =========>"+ request.toString());

        Tray tray = new Tray(request.getName(),request.getMaxWeight());

           String msg =trayDAO.addNewTray(tray);

          ReturnMessage reply= ReturnMessage.newBuilder().setMessage(msg).build();
          responseObserver.onNext(reply);
          responseObserver.onCompleted();

    }

}
