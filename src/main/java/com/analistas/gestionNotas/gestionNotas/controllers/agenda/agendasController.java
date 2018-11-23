package com.analistas.gestionNotas.gestionNotas.controllers.agenda;

import com.analistas.gestionNotas.gestionNotas.controllers.materias.materiasController;
import com.analistas.gestionNotas.gestionNotas.models.entitys.agenda.Agenda;
import com.analistas.gestionNotas.gestionNotas.models.entitys.materia.Materia;
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
import com.analistas.gestionNotas.gestionNotas.services.agenda.IAgendaService;

/**
 *
 * @author Matias
 */
@Controller
@SessionAttributes("agenda")
public class agendasController {

    @Autowired
    IAgendaService servAgenda;

    @Autowired
    IMateriaService servMateria;

    private Materia materia;
    

    @GetMapping({"secciones/agendas/{materia}"})
    public String Ver_Calendario_de_Materia_Elegida(Map m, @PathVariable("materia") Materia materia) {

        List<Agenda> listado = servAgenda.buscarPorMateria(materia);
        
        this.materia = materia;

        m.put("agendas", listado);
        m.put("materia", materia);

        return "secciones/agendas";
    }

    //A Evento (Calendario de Materia)
    @GetMapping("/secciones/formulario_agenda")
    public String Agregar_Evento(Map m) {

        Agenda agenda = new Agenda();

        m.put("agenda", agenda);
        m.put("materia", materia);

        return "/secciones/formulario_agenda";
    }

    //BM Evento (Calendario de Materia)
    @PostMapping("/secciones/formulario_agenda")
    public String Guardar_Evento(@Valid Agenda agenda) {
        
        agenda.setMateria(materia);

        servAgenda.save(agenda);
        return "redirect:/secciones/agendas/" + materia.getId();
    }

    @GetMapping({"/secciones/formulario_agenda/{id}"})
    public String Editar_Evento(@PathVariable(value = "id") int id, Map m) {
        Agenda agenda = new Agenda();
        agenda.setMateria(materia);
        agenda = servAgenda.buscarPorId(id);

        m.put("agenda", agenda);
        m.put("materia", materia);

        return "/secciones/formulario_agenda";
    }

}
