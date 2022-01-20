package com.sql.productosSQL.service;

import com.sql.productosSQL.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto createProduct(Producto producto);

    Producto createMap(Producto producto);
}
