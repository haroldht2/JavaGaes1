package com.innovatech.Innovatech.controller;
import com.innovatech.Innovatech.service.PagoService;
import com.innovatech.Innovatech.entity.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api")

public class PagoController {
    @Autowired
    private PagoService pagoService;

    @GetMapping("/pagos")
    public List<Pago> getPagos(){
        return pagoService.getPagos();

}

    @PostMapping("/pagos/new")
    public Pago savePago(@RequestBody Pago pago ){
        return pagoService.savePago(pago);
    }

    @GetMapping("/pagos/{id}")
    public Pago getPago(@PathVariable Long id){
        try{
            return pagoService.getPago(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @PutMapping("/pagos/update/{id}")
    public Pago updatePago(@PathVariable Long id, @RequestBody Pago pago){
        pago.setId(id);
        return pagoService.updatePago(pago);
    }

    @DeleteMapping("/pagos/delete/{id}")
    public List<Pago> deletePago(@PathVariable Long id){
        pagoService.deletePago(id);
        return getPagos();
    }

}
