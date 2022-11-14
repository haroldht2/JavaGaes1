package com.innovatech.Innovatech.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProductos", unique = true, nullable = false)
    private Long id;

    @Column(length = 50)
    private String nombreProducto;

    @Column(length = 50, name = "valorProducto")
    private String valorProducto;

    @Column(length = 50, name = "estadoProducto" )
    private String estadoProducto;

    @Column(length = 50, name = "stock" )
    private String stock;

    @Column(length = 50, name = "create_at" )
    private String create_at;

}


