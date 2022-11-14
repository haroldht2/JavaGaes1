package com.innovatech.Innovatech.service;
import com.innovatech.Innovatech.entity.Domicilios;
import com.innovatech.Innovatech.entity.Producto;
import com.innovatech.Innovatech.repository.IDomiciliosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DomiciliosService {

    @Autowired
    private IDomiciliosRepository IDomiciliosRepository;

    public List<Domicilios> getDomicilios(){List<Domicilios> Domicilios = IDomiciliosRepository.findAll();return Domicilios;}

    public Domicilios saveDomicilios(Domicilios domicilios){
        return IDomiciliosRepository.save(domicilios);
    }

    public Domicilios getDomicilios(Long id){
        return IDomiciliosRepository.findById(id).get();
    }

    public Domicilios updateDomicilios(Domicilios domicilios){
        return IDomiciliosRepository.save(domicilios);
    }

    public void deleteDomicilios(Long id){
        IDomiciliosRepository.deleteById(id);
    }

}
