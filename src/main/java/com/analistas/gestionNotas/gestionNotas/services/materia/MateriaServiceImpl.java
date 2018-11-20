/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.materia;

import com.analistas.gestionNotas.gestionNotas.dao.iMateria.IMateriaDao;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matias
 */
@Service
public class MateriaServiceImpl implements IMateriaService {
    
    @Autowired
    IMateriaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Materia> buscarTodo() {
       return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Materia buscarPorId(int id) {
       return dao.findById(id).orElse(null);
    }

    @Override
    public void save(Materia materia) {
        dao.save(materia);
    }
    
}
