package com.innovatech.Innovatech.service;

import com.innovatech.Innovatech.entity.Producto;
import com.innovatech.Innovatech.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    public List<Producto> getProductos(){List<Producto> productos = iProductoRepository.findAll();return productos;}

    public Producto saveProducto(Producto producto){
        return iProductoRepository.save(producto);
    }

    public Producto getProducto(Long id){
        return iProductoRepository.findById(id).get();
    }

    public Producto updateProducto(Producto producto){
        return iProductoRepository.save(producto);
    }

    public void deleteProducto(Long id){
        iProductoRepository.deleteById(id);
    }

}