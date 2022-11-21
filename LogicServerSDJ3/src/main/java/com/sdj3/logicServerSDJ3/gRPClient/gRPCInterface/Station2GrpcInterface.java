package com.sdj3.logicServerSDJ3.gRPClient.gRPCInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Tray;

public interface Station2GrpcInterface {
    String CreateTray(Tray tray);
   CreatePartDto CreatePart(CreatePartDto part);

}
