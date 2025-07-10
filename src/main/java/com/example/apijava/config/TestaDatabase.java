package com.example.apijava.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.apijava.entities.Curso;
import com.example.apijava.repositories.CursoRepository;

@Component
@Profile(value = "test")
public class TestaDatabase implements CommandLineRunner {
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public void run(String... args) throws Exception {

        Curso curso1 = new Curso("graduacao em ti", "exatas");
        Curso curso2 = new Curso("graduacao em sociologia", "humanas");
        Curso curso9 = new Curso("graduacao em matematica", "exatas");
        Curso curso3 = new Curso("graduacao em filosofia", "humanas");
        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        cursoRepository.save(curso9);
        cursoRepository.save(curso3);

    }
}
