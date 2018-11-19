/*

package com.analistas.gestionNotas.gestionNotas.models.entitys;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nota")
    @NotNull
    private float nota;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "examen")
    private List<Materia_Alumno> Materia_Alumno;

    private void addMaterias_Alumnos(Materia_Alumno Materia_Alumno) {
        this.Materia_Alumno.add(Materia_Alumno);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public List<Materia_Alumno> getMateria_Alumno() {
        return Materia_Alumno;
    }

    public void setMateria_Alumno(List<Materia_Alumno> Materia_Alumno) {
        this.Materia_Alumno = Materia_Alumno;
    }

}
*/