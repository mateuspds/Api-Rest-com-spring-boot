package com.example.apijava.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(name = "nome_faculdade", nullable = false, length = 200)
   private String nome;

   @Column(nullable = false)
   private String area;

   @JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
   @CreationTimestamp
   @Column(name = "data_De_Criacao")
   private LocalDateTime dataDeCriacao;

   @JsonFormat(pattern = "dd/MM/yyyy  HH:mm:SS")
   @UpdateTimestamp
   @Column(name = "data_De_Atualizacao")
   private LocalDateTime dataDeAtualizacao;

   private String usuario;

   @Transient
   private BigDecimal valorCurso;

   @OneToMany(mappedBy = "curso")
   private List<Aluno> alunos = new ArrayList<>();

   @PostPersist
   private void aposPersisitirDados() {
      this.nome = this.nome + " post";
   }

   @PrePersist
   private void prePersistirDados() {
      this.usuario = "admin";
   }

   public void setNome(String nome) {
      this.nome = nome;
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

   public LocalDateTime getDataDeCriacao() {
      return dataDeCriacao;
   }

   public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
      this.dataDeCriacao = dataDeCriacao;
   }

   public LocalDateTime getDataDeAtualizacao() {
      return dataDeAtualizacao;
   }

   public void setDataDeAtualizacao(LocalDateTime dataDeAtualizacao) {
      this.dataDeAtualizacao = dataDeAtualizacao;
   }

   public String getUsuario() {
      return usuario;
   }

   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }

   public Curso() {
   }

   public Curso(String nome, String area) {
      super();
      this.nome = nome;
      this.area = area;
   }

   public Integer getId() {
      return id;
   }

   public String getNome() {
      return nome;
   }

   @Override
   public String toString() {
      return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + "]";
   }

   public BigDecimal getValorCurso() {
      return valorCurso;
   }

   public void setValorCurso(BigDecimal valorCurso) {
      this.valorCurso = valorCurso;
   }

   public List<Aluno> getAlunos() {
      return alunos;
   }

   public void setAlunos(List<Aluno> alunos) {
      this.alunos = alunos;
   }

}
