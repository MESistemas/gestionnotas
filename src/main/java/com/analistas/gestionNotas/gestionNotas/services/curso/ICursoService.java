/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.curso;

import com.analistas.gestionNotas.gestionNotas.models.entitys.curso.Curso;
import java.util.List;

/**
 *
 * @author matia
 */
public interface ICursoService {
    
    public List<Curso> buscarTodo();
    
}
