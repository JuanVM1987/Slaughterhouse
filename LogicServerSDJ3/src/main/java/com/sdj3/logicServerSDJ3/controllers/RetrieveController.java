package com.sdj3.logicServerSDJ3.controllers;
import com.sdj3.logicServerSDJ3.logic.logicInterface.RetrieveLogicInterface;
import com.sdj3.logicServerSDJ3.share.dtos.*;
import com.sdj3.logicServerSDJ3.share.model.Animal;
import com.sdj3.logicServerSDJ3.share.model.Product;
import com.sdj3.logicServerSDJ3.share.model.Tray;
import io.grpc.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("trace")
public class RetrieveController {
    private RetrieveLogicInterface logic;

    public RetrieveController(RetrieveLogicInterface logic) {
        this.logic = logic;
    }
        @RequestMapping(value = "/getPruductsByAnimal/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseBody
        public ResponseEntity<Object> getAllProductFromAnimal(@PathVariable int id){
        try{
            return new ResponseEntity<>(logic.getAllProductFromAnimal(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
    @RequestMapping(value = "/getAnimalFromProduct/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> getAnimalFromProduct(@PathVariable int id) {


        try{

                return new ResponseEntity<>( logic.getAnimalFromProduct(id), HttpStatus.OK);


        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }


    }

    @RequestMapping(value = "/getAllAnimals",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> getAllAnimals() {
        try {
            List<Animal>animals =logic.getAllAnimals();
            return new ResponseEntity<>( animals,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @RequestMapping(value = "/getAnimalById/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> getAnimalById(@PathVariable int id) {
        try {

            return new ResponseEntity<>(logic.getAnimalById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value = "/getAllTrays",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> getAllTrays() {

        try {
            List<ReturnTrayDto> trays = logic.getAllTrays();

            return new ResponseEntity<>(trays,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @RequestMapping (value = "/getAllPartsInTray/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> getAllPartsInTray(@PathVariable int id) {

        try {
            List<ReturnPartDto> parts=logic.getAllPartsInTray(id);
            if (parts.isEmpty()){
                return new ResponseEntity<>("Tray "+id+" is empty", HttpStatus.OK);
            }
            return new ResponseEntity<>(logic.getAllPartsInTray(id), HttpStatus.OK);

        }catch (Exception e){
            Status s =Status.fromThrowable(e);
            if (s.getDescription().equals("FAILED_PRECONDITION")){
                return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
            }
           return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }

}
