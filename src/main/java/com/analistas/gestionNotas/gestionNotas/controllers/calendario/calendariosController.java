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
@SessionAttributes("calendario")
public class calendariosController {

    @Autowired
    ICalendarioService servCalendario;

    @Autowired
    IMateriaService servMateria;

    private Materia materia;
    

    @GetMapping({"secciones/calendario/{materia}"})
    public String Ver_Calendario_de_Materia_Elegida(Map m, @PathVariable("materia") Materia materia) {

        List<Calendario> listado = servCalendario.buscarPorMateria(materia);
        
        this.materia = materia;

        m.put("calendarios", listado);
        m.put("materia", materia);

        return "secciones/calendario";
    }

    //A Evento (Calendario de Materia)
    @GetMapping("/secciones/formulario_calendario")
    public String Agregar_Evento(Map m) {

        Calendario calendario = new Calendario();

        m.put("calendario", calendario);
        m.put("materia", materia);

        return "/secciones/formulario_calendario";
    }

    //BM Evento (Calendario de Materia)
    @PostMapping("/secciones/formulario_calendario")
    public String Guardar_Evento(@Valid Calendario calendario) {
        
        calendario.setMateria(materia);

        servCalendario.save(calendario);
        return "redirect:/secciones/calendario/" + materia.getId();
    }

    @GetMapping({"/secciones/formulario_calendario/{id}"})
    public String Editar_Evento(@PathVariable(value = "id") int id, Map m) {
        Calendario calendario = new Calendario();
        calendario.setMateria(materia);
        calendario = servCalendario.buscarPorId(id);

        m.put("evento", calendario);
        m.put("materia", materia);

        return "/secciones/formulario_calendario";
    }

}
