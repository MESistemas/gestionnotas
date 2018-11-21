/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.models.entitys.calendario;

import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author matia
 */
@Entity
@Table(name = "calendarios")
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titulo", length = 15)
    @NotNull
    private String titulo;

    @Column(name = "descripcion", length = 30)
    @NotNull
    private String descripcion;

    @Column(name = "fecha", length = 10)
    @NotNull
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "fk_Cal_Mat", referencedColumnName = "id")
    private Materia materia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

}
