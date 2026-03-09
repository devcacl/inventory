package com.usta.inventory_b.models.daos;

import com.usta.inventory_b.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findByNombreProdContainingIgnoreCase(String nombreProd);
    List<ProductEntity> findAllByOrderByPrecioAsc();
}
