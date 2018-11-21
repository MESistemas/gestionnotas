/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.controllers.calendario;

import com.analistas.gestionNotas.gestionNotas.controllers.materias.materiasController;
import com.analistas.gestionNotas.gestionNotas.models.entitys.calendario.Calendario;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
import com.analistas.gestionNotas.gestionNotas.services.calendario.ICalendarioService;
import com.analistas.gestionNotas.gestionNotas.services.materia.IMateriaService;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Matias
 */
@Controller
@SessionAttributes("Calendario")
public class calendariosController {

    @Autowired
    ICalendarioService servCalendario;

    @Autowired
    IMateriaService servMateria;

    private Materia materia;
    

    @GetMapping({"secciones/calendario/{materia}"})
    public String Ver_Calendario_de_Materia_Elegida(Map m, @PathVariable("materia") Materia materia) {

        this.materia = materia;

        List<Calendario> listado = servCalendario.buscarPorMateria(materia);

        m.put("calendarios", listado);
        m.put("materia", materia);

        return "secciones/calendario";
    }

    //A Evento (Calendario de Materia)
    @GetMapping("/secciones/formulario_calendario")
    public String Agregar_Evento(Map m) {

        Calendario evento = new Calendario();

        m.put("calendario", evento);
        m.put("materia", materia);

        return "/secciones/formulario_calendario";
    }

    //BM Evento (Calendario de Materia)
    @PostMapping("/secciones/formulario_calendario")
    public String Guardar_Alumno(@Valid Calendario calendario) {

        servCalendario.save(calendario);
        return "redirect:/secciones/formulario_calendario/";
    }

    @GetMapping({"/secciones/formulario_calendario/{id}"})
    public String Editar_Alumno(@PathVariable(value = "id") int id, Map m) {
        Calendario calendario = new Calendario();

        calendario = servCalendario.buscarPorId(id);

        m.put("evento", calendario);

        return "/secciones/formulario_calendario";
    }

}
