/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.dao;

import com.analistas.gestionNotas.gestionNotas.models.entitys.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author matia
 */
public interface ICursoDao extends JpaRepository<Curso, Integer> {
    
}
