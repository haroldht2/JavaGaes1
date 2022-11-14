package com.innovatech.Innovatech.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "roll")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRoll", unique = true, nullable = false)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50, name = "last_name")
    private String lastName;

    @Column(length = 50)
    private String password;
}
