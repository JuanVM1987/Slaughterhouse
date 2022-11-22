package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.Station2LogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("station2")
public class Station2Controller {
    private Station2LogicInterface logic;

    public Station2Controller(Station2LogicInterface logic) {
        this.logic = logic;
    }

    @RequestMapping(value = "/createPart",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> createPart( @RequestBody CreatePartDto dto){
        try {
            return new ResponseEntity<>( logic.createPart(dto),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }


    }

    @RequestMapping(value = "/createTray",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> createTray(@RequestBody Tray tray){
        try{
            return new ResponseEntity<>(  logic.createTray(tray), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }


}
