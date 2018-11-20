/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.controllers.materias;

import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.calendario_de_Materia;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import com.analistas.gestionNotas.gestionNotas.services.calendario.ICalendarioService;
import com.analistas.gestionNotas.gestionNotas.services.materia.IMateriaService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Matias
 */
@Controller
public class materiasController {
    
    @Autowired
    IMateriaService servMateria;
    
    @Autowired
    ICalendarioService servCalendario;
    
    private Materia materia;
    
    @GetMapping({"secciones/materias"})
    public String materiasController(Map m){
        List<Materia> listado = servMateria.buscarTodo();
        
        m.put("materias", listado);
        
        return "secciones/materias";
    }
    
    @GetMapping({"secciones/calendario/{materia}"})
    public String verCalendario(Map m, @PathVariable("materia") Materia materia){
        
        this.materia = materia;
        
        List<calendario_de_Materia> listado = servCalendario.buscarPorMateria(materia);
        
        m.put("calendarios", listado);
        m.put("materia", materia);
        
        return "secciones/calendario";
    }
    
}
