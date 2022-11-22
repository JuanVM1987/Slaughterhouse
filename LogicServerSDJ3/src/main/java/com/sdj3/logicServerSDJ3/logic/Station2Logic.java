package com.sdj3.logicServerSDJ3.logic;

import com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface.Station2GrpcInterface;
import com.sdj3.logicServerSDJ3.logic.logicInterface.Station2LogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Station2Logic implements Station2LogicInterface {
    private Station2GrpcInterface client;

    public Station2Logic(Station2GrpcInterface client) {
        this.client = client;
    }

    @Override
    public CreatePartDto createPart(CreatePartDto dto) {
        return client.CreatePart(dto);
    }

    @Override
    public String createTray( Tray tray) {
        return client.CreateTray(tray);
    }
}
