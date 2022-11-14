package com.innovatech.Innovatech.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "repartidor")
@Getter
@Setter
public class Repartidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRepartidor", unique = true, nullable = false)
    private Long id;

    @Column(length = 50, name = "nombreProducto")
    private String nombreProducto;

    @Column(length = 50, name = "aperepartidor")
    private String aperepartidor;

    @Column(length = 50)
    private String numcelular;

    @Column(length = 50)
    private String correo;
}
