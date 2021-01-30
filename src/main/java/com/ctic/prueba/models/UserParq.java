package com.ctic.prueba.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuparq")
public class UserParq {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int estudiante_cod;
    private int puesto_id;
    private Date fecha;
    private Date  hora;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstudiante_cod() {
        return estudiante_cod;
    }

    public void setEstudiante_cod(int estudiante_cod) {
        this.estudiante_cod = estudiante_cod;
    }

    public int getPuesto_id() {
        return puesto_id;
    }

    public void setPuesto_id(int puesto_id) {
        this.puesto_id = puesto_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
