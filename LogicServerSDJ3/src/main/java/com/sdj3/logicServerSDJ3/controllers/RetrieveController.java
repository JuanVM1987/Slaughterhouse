package com.sdj3.logicServerSDJ3.controllers;
import com.sdj3.logicServerSDJ3.logic.logicInterface.RetrieveLogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.*;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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
        public ArrayList<ReturnProductDto> getAllProductFromAnimal(@PathVariable int id){

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
    public ArrayList<ReturnTrayDto> getAllTrays() {
        return logic.getAllTrays();
    }
    @RequestMapping (value = "/getAllPartsInTray/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ArrayList<ReturnPartDto> getAllPartsInTray(@PathVariable int id) {
        return logic.getAllPartsInTray(id);
    }

}
