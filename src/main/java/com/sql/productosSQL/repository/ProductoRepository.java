package com.sql.productosSQL.repository;

import com.sql.productosSQL.model.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductoRepository extends CrudRepository<Producto, Long> {

        Producto findByName(String name);
        List<Producto> findByStockGreaterThan(int age);


        @Modifying
        @Query("update Producto p set p.stock = :stock where p.name = :name")
        void updateStock(@Param(value = "stock" ) int age, @Param(value = "name") String name);
    }



