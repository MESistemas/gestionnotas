/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao.iCalendario;

import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.calendario_de_Materia;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Matias
 */
public interface ICalendarioDao extends JpaRepository<calendario_de_Materia, Integer>{
     @Query("Select c from calendario_de_Materia c where c.materia = ?1")
     public List<calendario_de_Materia> buscarPorMateria(Materia materia);
}