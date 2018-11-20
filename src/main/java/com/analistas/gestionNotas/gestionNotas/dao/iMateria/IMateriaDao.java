/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao.iMateria;

import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Matias
 */
public interface IMateriaDao extends JpaRepository<Materia, Integer>{
    
}
