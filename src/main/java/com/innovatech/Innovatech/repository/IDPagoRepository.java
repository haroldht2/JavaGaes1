package com.innovatech.Innovatech.repository;
import com.innovatech.Innovatech.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDPagoRepository extends JpaRepository<Pago,Long>{
}
