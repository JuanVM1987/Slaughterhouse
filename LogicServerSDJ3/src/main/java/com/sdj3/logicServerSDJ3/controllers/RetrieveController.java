package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.RetrieveLogicInterface;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Part;
import com.sdj3.logicServerSDJ3.share.model.Product;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

@RestController
@RequestMapping("trace")
public class RetrieveController {
    private RetrieveLogicInterface logic;

    public RetrieveController(RetrieveLogicInterface logic) {
        this.logic = logic;
    }
        @RequestMapping(value = "/getPruductsByAnimal/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseBody
        public ArrayList<Product> getAllProductFromAnimal(@PathVariable int id){

        return logic.getAllProductFromAnimal(id);
    }
    @RequestMapping(value = "/getAnimalFromProduct/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ArrayList<Animal> getAnimalFromProduct(@PathVariable int id) {
        return logic.getAnimalFromProduct(id);
    }

    @RequestMapping(value = "/getAllAnimals",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ArrayList<Animal> getAllAnimals() {
        return logic.getAllAnimals();
    }
    @RequestMapping(value = "/getAnimalById/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Animal getAnimalById(@PathVariable int id) {
        return logic.getAnimalById(id);
    }
    @RequestMapping(value = "/getAllTrays",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ArrayList<Tray> getAllTrays() {
        return logic.getAllTrays();
    }
    @RequestMapping (value = "/getAllPartsInTray",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ArrayList<Part> getAllPartsInTray(@PathVariable int id) {
        return logic.getAllPartsInTray(id);
    }

}
