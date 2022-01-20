package com.sql.productosSQL.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Ciudad {

    @Id
    private Long id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    private Pais pais;

    public Ciudad(String name) {
        this.name = name;
        pais = new Pais();
    }
    public Ciudad(){}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
