/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.models.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author matia
 */
@Entity
@Table(name = "materias_alumnos")
public class Materia_Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nota_Primer_Examen")
    @NotNull
    private int notaPrimerExamen;

    @Column(name = "nota_Segundo_Examen")
    @NotNull
    private int notaSegundoExamen;

    @Column(name = "nota_Tercer_Examen")
    @NotNull
    private int notaTercerExamen;

    @Column(name = "nota_Primer_TP")
    @NotNull
    private int notaPrimerTP;

    @Column(name = "nota_Segundo_TP")
    @NotNull
    private int notaSegundoTP;

    @Column(name = "nota_Primer_Trimestre")
    @NotNull
    private int notaPrimerTrimestre;

    @Column(name = "nota_Segundo_Trimestre")
    @NotNull
    private int notaSegundoTrimestre;

    @Column(name = "nota_Tercer_Trimestre")
    @NotNull
    private int notaTercerTrimestre;

    @Column(name = "nota_Final")
    @NotNull
    private int notaFinal;

    @Column(name = "condicion", length = 15)
    @NotNull
    private String condicion;

    @ManyToOne
    @JoinColumn(name = "fk_Mat_Alu", referencedColumnName = "id")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "fk_Mat", referencedColumnName = "id")
    private Materia materia;

    /*
    @ManyToOne
    @JoinColumn(name = "fk_Mat_Exa", referencedColumnName = "id")
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "fk_Mat_Pra", referencedColumnName = "id")
    private Practico practico; */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotaPrimerTrimestre() {
        return notaPrimerTrimestre;
    }

    public void setNotaPrimerTrimestre(int notaPrimerTrimestre) {
        this.notaPrimerTrimestre = notaPrimerTrimestre;
    }

    public int getNotaSegundoTrimestre() {
        return notaSegundoTrimestre;
    }

    public void setNotaSegundoTrimestre(int notaSegundoTrimestre) {
        this.notaSegundoTrimestre = notaSegundoTrimestre;
    }

    public int getNotaTercerTrimestre() {
        return notaTercerTrimestre;
    }

    public void setNotaTercerTrimestre(int notaTercerTrimestre) {
        this.notaTercerTrimestre = notaTercerTrimestre;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

}
