package com.example.apijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apijava.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
