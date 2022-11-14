package com.innovatech.Innovatech.controller;

import com.innovatech.Innovatech.entity.Producto;
import com.innovatech.Innovatech.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/Productos")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @PostMapping("/productos/new")
    public Producto saveProducto(@RequestBody Producto producto){return productoService.saveProducto(producto);}

    @GetMapping("/productos/{id}")
    public Producto getProductos(@PathVariable Long id){
        try{
            return productoService.getProducto(id);
        }catch (Exception ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @PutMapping("/productos/update/{id}")
    public Producto updateProductos(@PathVariable Long id, @RequestBody Producto producto){
        producto.setId(id);
        return productoService.updateProducto(producto);
    }

    @DeleteMapping("/productos/delete/{id}")
    public List<Producto> deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
        return getProductos();
    }

}