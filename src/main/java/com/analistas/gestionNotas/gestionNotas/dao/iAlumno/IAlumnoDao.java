/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao.iAlumno;

import com.analistas.gestionNotas.gestionNotas.models.entitys.alumno.Alumno;
import com.analistas.gestionNotas.gestionNotas.models.entitys.curso.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface IAlumnoDao extends JpaRepository<Alumno, Integer> {
    
    @Query("Select a from Alumno a where a.curso = ?1 ORDER BY a.genero, a.apellido")
    public List<Alumno> buscarPorCurso(Curso curso);
    
    @Query("Select a from Alumno a where a.dni = ?1 AND a.curso = ?2")
    public List<Alumno> buscarPorDni(String dni, Curso curso);
    

}

