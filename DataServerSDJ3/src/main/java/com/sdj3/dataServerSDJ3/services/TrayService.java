package com.sdj3.dataServerSDJ3.services;

import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.services.serviceInterface.TrayServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrayService implements TrayServiceInterface {

    private final TrayDAO trayDAO;

    @Autowired
    public TrayService(TrayDAO trayDAO) {
        this.trayDAO = trayDAO;
    }

    @Override
    public String createTray(Tray tray) {
        Tray tray1= trayDAO.save(tray);

        return "Tray is create success with id: "+tray1.getId();
    }
}
