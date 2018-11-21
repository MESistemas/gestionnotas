/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.calendario;

import com.analistas.gestionNotas.gestionNotas.dao.iCalendario.ICalendarioDao;
import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.Calendario;
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
public class CalendarioServiceImpl implements ICalendarioService{
    
    @Autowired
    ICalendarioDao dao;

    @Override
    public List<Calendario> buscarPorMateria(Materia materia){
        return dao.buscarPorMateria(materia);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Calendario buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Calendario materia) {
        dao.save(materia);
    }
    
}
