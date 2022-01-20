package com.sql.productosSQL.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Producto {

    @Id
    private Long id;
    private String name;
    private int stock;

    @ManyToOne(cascade = CascadeType.ALL)
    private Ciudad ciudad;
    public Producto() {}

    public Producto(String name, int stock) {
        this.name = name;
        this.stock = stock;
        ciudad=new Ciudad();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
