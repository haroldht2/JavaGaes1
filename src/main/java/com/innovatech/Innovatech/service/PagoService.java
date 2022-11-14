package com.innovatech.Innovatech.service;
import com.innovatech.Innovatech.entity.Pago;
import com.innovatech.Innovatech.repository.IDPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {

    @Autowired
    private IDPagoRepository idPagoRepository;

    public List<Pago> getPagos(){
        return idPagoRepository.findAll();
    }

    public Pago savePago(Pago pago){
        return idPagoRepository.save(pago);
    }

    public Pago getPago(Long idPago){
        return idPagoRepository.findById(idPago).get();
    }

    public Pago updatePago(Pago pago){
        return idPagoRepository.save(pago);
    }

    public void deletePago(Long id){
        idPagoRepository.deleteById(id);
    }


}
