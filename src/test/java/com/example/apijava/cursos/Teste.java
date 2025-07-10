package com.example.apijava.cursos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.apijava.entities.Curso;

 class Teste {

    private int contador;

    @BeforeEach
    void inicializar() {
        contador = 10;
        System.out.println("Executando @BeforeEach");
    }

    @Test
    void teste1() {
        contador++;
        assertEquals(11, contador);
    }

    @Test
    void teste2() {
        contador += 5;
        assertEquals(15, contador);
    }

    @Test
    void test() {

        Curso cursos = new Curso();
        assertNotNull(cursos.getArea());
    }

    @Test
    void testarCursovazio() {
        Curso cursos = new Curso();
        assertNotNull(cursos);

    }

    @Test
    void testavalor() {
        Curso cursos = new Curso();
        cursos.setValorCurso(new BigDecimal("199.99"));

        assertEquals(new BigDecimal("199.99"), cursos.getValorCurso());
    }

}
