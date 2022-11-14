package com.innovatech.Innovatech.controller;

import com.innovatech.Innovatech.entity.Repartidor;
import com.innovatech.Innovatech.service.RepartidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api")

public class RepartidorController {

    @Autowired
    private RepartidorService repartidorService;

    @GetMapping("/repartidor")
    public List<Repartidor> getRepartidor(){
        return repartidorService.getRepartidor();
    }

    @PostMapping("/repartidor/new")
    public Repartidor saveRepartidor(@RequestBody Repartidor Repartidor){return repartidorService.saveRepartidor(Repartidor);}

    @GetMapping("/repartidor/{id}")
    public Repartidor getRepartidor(@PathVariable Long id){
        try{
            return repartidorService.getRepartidor(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @PutMapping("/repartidor/update/{id}")
    public Repartidor updateRepartidor(@PathVariable Long id, @RequestBody Repartidor repartidor){
        repartidor.setId(id);
        return repartidorService.updateRepartidor(repartidor);
    }

    @DeleteMapping("/repartidor/delete/{id}")
    public List<Repartidor> deleteRepartidor(@PathVariable Long id){
        repartidorService.deleteRepartidor(id);
        return getRepartidor();
    }
}
