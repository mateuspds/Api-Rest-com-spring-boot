package com.example.apijava.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apijava.entities.Curso;
import com.example.apijava.repositories.CursoRepository;
import com.example.apijava.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;



    @Override
    public List<Curso> getcCursos() {
        return cursoRepository.findAll();
    }



    @Override
    public Curso save(Curso curso) {
        curso.setId(null);
        return cursoRepository.save(curso);
    }



    @Override
    public Curso findById(Integer id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        return curso.orElse(null);
        
    }



    @Override
    public List<Curso> findByNome(String valor) {
         return cursoRepository.findByNomeContaining(valor);
        
    }



    @Override
    public void update(Curso curso) {
         Curso atual = this.findById(curso.getId());

         atual.setNome(curso.getNome());
         atual.setArea(curso.getArea());

         cursoRepository.save(atual);
    }



    @Override
    public void delete(Integer id) {
        Curso curso = this.findById(id);
        cursoRepository.delete(curso);    
    
    }

}
