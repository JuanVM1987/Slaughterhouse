package com.sdj3.logicServerSDJ3.logic.logicInterface;

import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Tray;

public interface Station2LogicInterface {
    CreatePartDto createPart(CreatePartDto dto);

    String createTray(Tray tray);
}
