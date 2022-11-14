package com.innovatech.Innovatech.repository;
import com.innovatech.Innovatech.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IProductoRepository extends JpaRepository <Producto,Long>{
}
