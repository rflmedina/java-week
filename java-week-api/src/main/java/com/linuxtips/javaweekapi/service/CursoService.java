package com.linuxtips.javaweekapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linuxtips.javaweekapi.model.Curso;
import com.linuxtips.javaweekapi.repository.CursoRepository;

@Service
public class CursoService {
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private CursoRepository cursoRepository;


    public Curso criarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> ListarCursos() {
        return cursoRepository.findAll();
    } 
}
