/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.alumno;

import com.analistas.gestionNotas.gestionNotas.dao.iAlumno.IAlumnoDao;
import com.analistas.gestionNotas.gestionNotas.models.entitys.alumno.Alumno;
import com.analistas.gestionNotas.gestionNotas.models.entitys.curso.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author matia
 */
public interface IAlumnoService {

    public List<Alumno> buscarTodo();

    public Alumno buscarPorId(int id);

    public void save(Alumno alumno);
    
    public List<Alumno> buscarPorCurso(Curso curso);
    
    public List<Alumno> buscarPorDni(String dni, Curso curso);
    

}
