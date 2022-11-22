package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.Station2LogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.CreatePartDto;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import org.springframework.http.MediaType;
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
    public CreatePartDto createPart( @RequestBody CreatePartDto dto){
        return logic.createPart(dto);

    }

    @RequestMapping(value = "/createTray",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String createTray(@RequestBody Tray tray){
        return logic.createTray(tray);
    }


}
