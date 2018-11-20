/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.services.calendario;

import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.calendario_de_Materia;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import java.util.List;

/**
 *
 * @author Matias
 */
public interface ICalendarioService {

    public List<calendario_de_Materia> buscarPorMateria(Materia materia);

}
