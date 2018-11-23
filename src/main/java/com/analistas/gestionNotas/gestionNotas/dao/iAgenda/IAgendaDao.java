/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao.iAgenda;

import com.analistas.gestionNotas.gestionNotas.models.entitys.agenda.Agenda;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Matias
 */
public interface IAgendaDao extends JpaRepository<Agenda, Integer>{
     @Query("Select c from Agenda c where c.materia = ?1")
     public List<Agenda> buscarPorMateria(Materia materia);
}
