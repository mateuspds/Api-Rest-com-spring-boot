package com.example.apijava.services;

import java.util.List;

import com.example.apijava.entities.Curso;

public interface CursoService {

    public List<Curso> getcCursos();

    public Curso save(Curso curso);

    public Curso findById(Integer id);

    public List<Curso> findByNome (String nome);

    public void update (Curso curso);

    public void delete (Integer id);

}
