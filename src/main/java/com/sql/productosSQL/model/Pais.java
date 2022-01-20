package com.sql.productosSQL.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Pais {

    @Id
    private Long id;
    private String name;

    public Pais(String name) {
        this.name = name;
    }
    public Pais(){}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
