package com.innovatech.Innovatech.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "domicilios")
@Getter
@Setter
public class Domicilios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDomicilios", unique = true, nullable = false)
    private Long id;

    @Column(length = 50)
    private String fecha;

    @Column(length = 50, name = "nombreUsuario")
    private String nombreUsuarios;

    @Column(length = 50, name = "factura" )
    private String facturas;

    @Column(length = 50, name = "direccion" )
    private String direcciones;

}
