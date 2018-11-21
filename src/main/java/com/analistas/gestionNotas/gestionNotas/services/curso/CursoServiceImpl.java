/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.curso;

import com.analistas.gestionNotas.gestionNotas.services.curso.ICursoService;
import com.analistas.gestionNotas.gestionNotas.dao.iCurso.ICursoDao;
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
public class CursoServiceImpl implements ICursoService{
    
    @Autowired
    ICursoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> buscarTodo() {
       return dao.findAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Curso buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Curso curso) {
        dao.save(curso);
    }
    
}
