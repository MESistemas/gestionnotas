/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.alumno;

import com.analistas.gestionNotas.gestionNotas.services.alumno.IAlumnoService;
import com.analistas.gestionNotas.gestionNotas.dao.iAlumno.IAlumnoDao;
import com.analistas.gestionNotas.gestionNotas.models.entitys.alumno.Alumno;
import com.analistas.gestionNotas.gestionNotas.models.entitys.curso.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class AlumnoServiceImpl implements IAlumnoService {

    @Autowired
    IAlumnoDao dao;

    @Autowired
    private IAlumnoDao alumnoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> buscarTodo() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Alumno buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Alumno alumno) {
        dao.save(alumno);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> buscarPorCurso(Curso curso) {
        return dao.buscarPorCurso(curso);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> buscarPorDni(String dni, Curso curso) {
        return dao.buscarPorDni(dni, curso);
    }

}
