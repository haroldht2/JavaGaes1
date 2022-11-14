package com.innovatech.Innovatech.repository;
import com.innovatech.Innovatech.entity.Repartidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepartidorRepository extends JpaRepository <Repartidor,Long> {
}
