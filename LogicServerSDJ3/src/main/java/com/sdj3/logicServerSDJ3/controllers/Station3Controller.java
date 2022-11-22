package com.sdj3.logicServerSDJ3.controllers;

import com.sdj3.logicServerSDJ3.logic.logicInterface.Station3LogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.CreateProductDto;
import com.sdj3.logicServerSDJ3.share.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("station3")
public class Station3Controller {
    private Station3LogicInterface logic;

    public Station3Controller(Station3LogicInterface logicInterface) {
        this.logic = logicInterface;
    }

    @RequestMapping(value = "/createProduct",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Product createProduct (@RequestBody CreateProductDto dto){
        return logic.createProduct(dto);
    }
}
