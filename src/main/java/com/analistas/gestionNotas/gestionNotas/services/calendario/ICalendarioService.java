/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.calendario;

import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.Calendario;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;

/**
 *
 * @author Matias
 */
public interface ICalendarioService {

    public List<Calendario> buscarPorMateria(Materia materia);
    
    public void save(Calendario calendario);
    
    public Calendario buscarPorId(int id);

}
