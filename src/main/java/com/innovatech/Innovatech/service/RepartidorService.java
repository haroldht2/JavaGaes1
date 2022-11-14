package com.innovatech.Innovatech.service;


import com.innovatech.Innovatech.entity.Repartidor;

import com.innovatech.Innovatech.repository.IRepartidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RepartidorService {

    @Autowired
    private IRepartidorRepository iRepartidorRepository;

    public List<Repartidor> getRepartidor(){List<Repartidor> Repartidor = iRepartidorRepository.findAll();return Repartidor;}

    public Repartidor saveRepartidor(Repartidor Repartidor){
        return iRepartidorRepository.save(Repartidor);
    }

    public Repartidor getRepartidor(Long id){
        return iRepartidorRepository.findById(id).get();
    }

    public Repartidor updateRepartidor(Repartidor Repartidor){
        return iRepartidorRepository.save(Repartidor);
    }

    public void deleteRepartidor(Long id){
        iRepartidorRepository.deleteById(id);
    }
}
