package com.sdj3.dataServerSDJ3.gRPCConnection;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage;
import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage;
import com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartServiceGrpc;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.lognet.springboot.grpc.recovery.GRpcExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.Optional;

@GRpcService
public class PartGrpcConnection extends PartServiceGrpc.PartServiceImplBase {


    private final PartDAO partDAO;
    private final AnimalDAO animalDAO;
    private final TrayDAO trayDAO;

    @Autowired
    public PartGrpcConnection(PartDAO partDAO, AnimalDAO animalDAO, TrayDAO trayDAO) {
        this.partDAO = partDAO;
        this.animalDAO = animalDAO;
        this.trayDAO = trayDAO;
    }

    @Override
    public void creatPart(AddPartMessage request, StreamObserver<PartMessage> response) {
        Optional<Tray> tray = trayDAO.findById(request.getTrayId());
        Optional<Animal> animal = animalDAO.findById(request.getAnimalId());

       /* if (animal.isEmpty()) {
            throw new RuntimeException("Animal");
        }

        if (tray.isEmpty()) {

        }
        int actualWeight = trayDAO.getActualWeight(tray.get().getId());
        if (tray.get().getMax_weight() < actualWeight + request.getWeight()) {
        }*/
        Part part = partDAO.save(new Part(request.getName(), request.getWeight(), tray.get(), animal.get()));


        PartMessage reply = PartMessage.newBuilder().setId(part.getId()).setName(part.getName())
                .setWeight(part.getWeight()).setTrayId(part.getTray().getId())
                .setAnimalId(part.getAnimal().getId()).build();
        response.onNext(reply);
        response.onCompleted();

    }


}
