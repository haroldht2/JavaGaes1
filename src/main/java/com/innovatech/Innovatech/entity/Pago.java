package com.innovatech.Innovatech.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "Pago")
@Getter
@Setter
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPago", unique = true, nullable = false)
    private Long id;

    @Column(length = 50 , name = "desPago")
    private String desPago;


}
