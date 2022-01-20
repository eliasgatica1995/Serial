package com.sql.productosSQL.controller;

import com.sql.productosSQL.model.Producto;
import com.sql.productosSQL.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService service;

    @PostMapping("/serial")
    public Producto createProductSerial(@RequestBody Producto producto) {
        return service.createProduct(producto);
    }

    @PostMapping("/map")
    public Producto createProductMap(@RequestBody Producto producto) {
        return service.createMap(producto);
    }

}

