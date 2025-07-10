package com.example.apijava.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "material")
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_faculdade", nullable = false, length = 200)
    private String nome;

    @ManyToMany()
    @JoinTable(name = "grade_materia", joinColumns = {
            @JoinColumn(name = "materia_id", referencedColumnName = "id")

    }, inverseJoinColumns = {
            @JoinColumn(name = "grade_id", referencedColumnName = "id"),
    }

    )
    private Set<GradeCurricular> grades = new HashSet<>();

    public Material() {
    }

    public Material(String nome, Set<GradeCurricular> grades) {
        this.nome = nome;
        this.grades = grades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<GradeCurricular> getGrades() {
        return grades;
    }

    public void setGrades(Set<GradeCurricular> grades) {
        this.grades = grades;
    }

    

    

}
