package com.linuxtips.javaweekapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.linuxtips.javaweekapi.model.Curso;
import com.linuxtips.javaweekapi.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    } 

    CursoService cursoService;

    @PostMapping("/cursos")
    // @ResponseStatus(HttpStatus.CREATED)
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoService.criarCurso(curso);
    }

    @GetMapping("/cursos")
    // @ResponseStatus(HttpStatus.OK)
    public List<Curso> ListarCursos() {
        return cursoService.ListarCursos();
    }

    
}
