/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao.iCalendario;

import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.Calendario;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Matias
 */
public interface ICalendarioDao extends JpaRepository<Calendario, Integer>{
     @Query("Select c from Calendario c where c.materia = ?1")
     public List<Calendario> buscarPorMateria(Materia materia);
}
