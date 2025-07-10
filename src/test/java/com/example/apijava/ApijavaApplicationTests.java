package com.example.apijava;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.apijava.entities.Curso;
import com.example.apijava.services.CursoService;



@SpringBootTest
class ApijavaApplicationTests {
    @Autowired
	private CursoService cursoservice;

	

	@Test
	void contextLoads() {

		List<Curso> cursos = cursoservice.getcCursos();
		System.out.println("cursos" );
		System.out.println(cursos);
	}

}
