package com.sdj3.dataServerSDJ3.services;

import com.sdj3.dataServerSDJ3.DAOs.AnimalDAO;
import com.sdj3.dataServerSDJ3.DAOs.PartDAO;
import com.sdj3.dataServerSDJ3.DAOs.TrayDAO;
import com.sdj3.dataServerSDJ3.services.serviceInterface.PartServiceInterface;
import com.sdj3.dataServerSDJ3.share.entity.Animal;
import com.sdj3.dataServerSDJ3.share.entity.Part;
import com.sdj3.dataServerSDJ3.share.entity.Tray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PartService implements PartServiceInterface {

    private final PartDAO partDAO;
    private final AnimalDAO animalDAO;
    private final TrayDAO trayDAO;

    @Autowired
    public PartService(PartDAO partDAO, AnimalDAO animalDAO, TrayDAO trayDAO) {
        this.partDAO = partDAO;
        this.animalDAO = animalDAO;
        this.trayDAO = trayDAO;
    }


    @Override
    public Part addPart(Part part) {
        Animal animal= animalDAO.getReferenceById(part.getAnimal().getId());
        Tray tray =trayDAO.getReferenceById(part.getTray().getId());
        part.setAnimal(animal);
        part.setTray(tray);
        return partDAO.save(part);

    }
}
