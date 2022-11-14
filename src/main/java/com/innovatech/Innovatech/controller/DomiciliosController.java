package com.innovatech.Innovatech.controller;
import com.innovatech.Innovatech.entity.Domicilios;
import com.innovatech.Innovatech.service.DomiciliosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api")
public class DomiciliosController {

    @Autowired
    private DomiciliosService domiciliosService;

    @GetMapping("/Domicilios")
    public List<Domicilios> getDomicilios(){
        return domiciliosService.getDomicilios();
    }

    @PostMapping("/Domicilios/new")
    public Domicilios saveDomicilios(@RequestBody Domicilios domicilios){return domiciliosService.saveDomicilios(domicilios);}

    @GetMapping("/domicilios/{id}")
    public Domicilios getDomicilios(@PathVariable Long id){
        try{
            return domiciliosService.getDomicilios(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @PutMapping("/Domicilios/update/{id}")
    public Domicilios updateDomicilios(@PathVariable Long id, @RequestBody Domicilios domicilios){
        domicilios.setId(id);
        return domiciliosService.updateDomicilios(domicilios);
    }

    @DeleteMapping("/domicilios/delete/{id}")
    public List<Domicilios> deleteDomicilios(@PathVariable Long id){
        domiciliosService.deleteDomicilios(id);
        return getDomicilios();
    }

}
