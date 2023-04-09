package com.linuxtips.javaweekapi.repository;

import org.springframework.stereotype.Repository;

import com.linuxtips.javaweekapi.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
    
}
