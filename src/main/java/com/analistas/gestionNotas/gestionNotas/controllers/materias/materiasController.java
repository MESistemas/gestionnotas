/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.controllers.materias;

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
@SessionAttributes("materia")
public class materiasController {

    @Autowired
    IMateriaService servMateria;

    @GetMapping({"secciones/materias"})
    public String Listar_Materias(Map m) {
        List<Materia> listado = servMateria.buscarTodo();

        m.put("materias", listado);

        return "secciones/materias";
    }

    // BM Materias
    @PostMapping("/secciones/formulario_materia")
    public String Guardar_Materia(@Valid Materia materia) {
        servMateria.save(materia);
        return "redirect:/secciones/materias";
    }

    @GetMapping({"/secciones/formulario_materia/{id}"})
    public String Editar_Materia(@PathVariable(value = "id") int id, Map m) {
        Materia materia = new Materia();
        materia = servMateria.buscarPorId(id);

        m.put("materia", materia);

        return "/secciones/formulario_materia";
    }

}
