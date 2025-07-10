package com.example.apijava.entities.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CursoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "nome esta vazio")
    @NotNull
    @Size(min = 5, max = 25)
    private String nome;
    private Integer id;
    @NotBlank
    private String area;

    public CursoDto(String nome, Integer id, String area) {
        this.nome = nome;
        this.id = id;
        this.area = area;
    }

    public CursoDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
