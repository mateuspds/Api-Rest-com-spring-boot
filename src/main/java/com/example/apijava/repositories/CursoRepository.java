package com.example.apijava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apijava.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    List<Curso> findByNomeContaining (String nome);
}
