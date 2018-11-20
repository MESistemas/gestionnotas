/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionNotas.gestionNotas.controllers.alumnos;

import com.analistas.gestionNotas.gestionNotas.dao.iAlumno.IAlumnoDao;
import com.analistas.gestionNotas.gestionNotas.models.entitys.alumno.Alumno;
import com.analistas.gestionNotas.gestionNotas.models.entitys.curso.Curso;
import com.analistas.gestionNotas.gestionNotas.services.alumno.IAlumnoService;
import com.analistas.gestionNotas.gestionNotas.services.curso.ICursoService;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author matia
 */
@Controller
@SessionAttributes("alumno")
public class alumnosController {

    @Autowired
    ICursoService servCurso;

    @Autowired
    IAlumnoService servAlumno;

    private Curso curso;

    //Acá es donde yo recibo el Curso.id que paso desde "elegir_curso"
    @RequestMapping(value = "/secciones/alumnos/{curso}", method = RequestMethod.GET)
    public String listarPorCurso(Map<String, Object> m, @PathVariable("curso") Curso curso) {
        List<Alumno> listado = servAlumno.buscarPorCurso(curso);

        this.curso = curso;

        m.put("alumnos", listado);
        m.put("curso", curso.getId());
        m.put("nombreCurso", curso);

        return "/secciones/alumnos";
    }

    @GetMapping({"/secciones/elegir_curso"})
    public String elegir_cursoController(Map<String, Object> m) {

        List<Curso> listado = servCurso.buscarTodo();

        m.put("cursos", listado);

        return "/secciones/elegir_curso";
    }

    @GetMapping("/secciones/busqueda_alumno_por_dni")
    public String buscar(@RequestParam(name = "dni", required = false) String dni, Map m) {

        List<Alumno> listado = servAlumno.buscarPorDni(dni, curso);
        
        String mensaje = "";

        if(listado.isEmpty()){
            mensaje = "No se encontraron resultados...";
        }else{
            mensaje = "Se ha encontrado: ";
        }
        
        m.put("mensaje", mensaje);
        m.put("alumnos", listado);
        m.put("curso", curso.getId());
        m.put("nombreCurso", curso);

        return "/secciones/alumnos";
    }
    
    @GetMapping("/secciones/formulario_alumno")
    public String agregar(){
        
        return "/secciones/formulario_alumno";
    }
    
    
    
}
