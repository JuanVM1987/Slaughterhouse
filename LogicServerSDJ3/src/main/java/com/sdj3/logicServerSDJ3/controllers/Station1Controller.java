package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.Station1LogicInterface;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> registerAnimal(@RequestBody Animal animal){
        try{
            return new ResponseEntity<>(logic.registerAnimal(animal), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
}
