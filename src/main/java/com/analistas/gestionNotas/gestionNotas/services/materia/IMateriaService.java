/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.materia;

import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;

/**
 *
 * @author Matias
 */
public interface IMateriaService {
    
    public List<Materia> buscarTodo();

    public Materia buscarPorId(int id);

    public void save(Materia materia);
    
}
