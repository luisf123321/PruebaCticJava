package com.ctic.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "parqueadero")
public class Parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int puesto;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
