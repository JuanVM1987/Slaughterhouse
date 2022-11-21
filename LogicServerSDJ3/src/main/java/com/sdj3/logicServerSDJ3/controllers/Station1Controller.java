package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.Station1LogicInterface;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("station1")
public class Station1Controller {

    private Station1LogicInterface logic;

    public Station1Controller(Station1LogicInterface logic) {
        this.logic = logic;
    }

    @RequestMapping(value = "/registerAnimal",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Animal registerAnimal(@RequestBody Animal animal){

        return logic.registerAnimal(animal);
    }
}
