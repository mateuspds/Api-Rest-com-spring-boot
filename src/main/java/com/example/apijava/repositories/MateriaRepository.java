package com.example.apijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apijava.entities.Material;

public interface MateriaRepository extends JpaRepository<Material, Integer> {

}
