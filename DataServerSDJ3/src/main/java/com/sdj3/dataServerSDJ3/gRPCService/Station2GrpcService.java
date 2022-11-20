package com.sdj3.dataServerSDJ3.gRPCService;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;

import com.sdj3.dataServerSDJ3.protobuf.station2Protobuf.*;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class Station2GrpcService extends Station2ServiceGrpc.Station2ServiceImplBase {


    private final PartDAO partDAO;
    private final AnimalDAO animalDAO;
    private final TrayDAO trayDAO;

    @Autowired
    public Station2GrpcService(PartDAO partDAO, AnimalDAO animalDAO, TrayDAO trayDAO) {
        this.partDAO = partDAO;
        this.animalDAO = animalDAO;
        this.trayDAO = trayDAO;
    }

    @Override
    public void createTray(TrayMessage request, StreamObserver<ReturnMessage> responseObserver) {
        Tray tray = new Tray(request.getName(), request.getMaxWeight());
        Tray tray1 = trayDAO.save(tray);

        String msg = "Successfully add a tray with id: " + tray1.getId();
        ReturnMessage reply = ReturnMessage.newBuilder().setMessage(msg).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }

    @Override
    public void createPart(PartMessage request, StreamObserver<ReturnPartMessage> response) {

        Optional<Animal> animal = animalDAO.findById(request.getAnimalId());

        if (animal.isEmpty()) {
            handlerStatus("Animal with Id " + request.getAnimalId() + " is not Fund", response);
            return;
        }
        Optional<Tray> tray = trayDAO.findById(request.getTrayId());

        if (tray.isEmpty()) {
            handlerStatus("Tray with Id " + request.getTrayId() + " is not Fund", response);
            return;
        }
        Double actualWeight = trayDAO.getActualWeight(request.getTrayId());

        if (actualWeight != null && tray.get().getMax_weight() < actualWeight + request.getWeight()) {
            handlerStatus("The tray with ID " + tray.get().getId() + " is full", response);
            return;
        }
        Part part = partDAO.save(new Part(request.getName(), request.getWeight(),tray.get(), animal.get()));


        ReturnPartMessage reply = ReturnPartMessage.newBuilder().setId(part.getId()).setName(part.getName())
                .setWeight(part.getWeight()).setTrayId(tray.get().getId())
                .setAnimalId(part.getAnimal().getId()).build();
        response.onNext(reply);
        response.onCompleted();

    }

    public void handlerStatus(String msg, StreamObserver<ReturnPartMessage> response) {
        Status status = Status.FAILED_PRECONDITION.withDescription(msg);

        response.onError(status.asRuntimeException());
    }


}
