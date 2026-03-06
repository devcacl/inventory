package com.usta.inventory_b.models.daos;

import com.usta.inventory_b.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao extends JpaRepository<ProductEntity,Long> {

    // Buscar por categoría
    List<ProductEntity> findByCategoriaIgnoreCase(String categoria);

    // Buscar por marca
    List<ProductEntity> findByMarcaIgnoreCase(String marca);

    // Buscar productos con stock mayor a X
    List<ProductEntity> findByStockGreaterThan(Integer stock);

    // Buscar productos activos
    List<ProductEntity> findByEstadoProd(String estadoProd);

    // Buscar por rango de precios
    List<ProductEntity> findByPrecioBetween(BigDecimal min, BigDecimal max);


}
