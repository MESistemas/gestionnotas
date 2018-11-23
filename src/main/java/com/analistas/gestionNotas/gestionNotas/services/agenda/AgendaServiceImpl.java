/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.agenda;

import com.analistas.gestionNotas.gestionNotas.models.entitys.agenda.Agenda;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.analistas.gestionNotas.gestionNotas.dao.iAgenda.IAgendaDao;

/**
 *
 * @author Matias
 */
@Service
public class AgendaServiceImpl implements IAgendaService{
    
    @Autowired
    IAgendaDao dao;

    @Override
     @Transactional(readOnly = true)
    public List<Agenda> buscarPorMateria(Materia materia){
        return dao.buscarPorMateria(materia);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Agenda buscarPorId(int id) {
        return dao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Agenda agenda) {
        dao.save(agenda);
    }
    
}
