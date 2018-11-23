/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.agenda;

import com.analistas.gestionNotas.gestionNotas.models.entitys.agenda.Agenda;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;

/**
 *
 * @author Matias
 */
public interface IAgendaService {

    public List<Agenda> buscarPorMateria(Materia materia);
    
    public void save(Agenda agenda);
    
    public Agenda buscarPorId(int id);

}
