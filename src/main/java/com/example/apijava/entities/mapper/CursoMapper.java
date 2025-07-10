package com.example.apijava.entities.mapper;

import org.springframework.stereotype.Service;

import com.example.apijava.entities.Curso;
import com.example.apijava.entities.dto.CursoDto;

@Service
public class CursoMapper {

    public Curso mapCursoDtCurso(CursoDto dto) {
        Curso curso = new Curso(dto.getNome(), dto.getArea());
        return curso;
    }

}
