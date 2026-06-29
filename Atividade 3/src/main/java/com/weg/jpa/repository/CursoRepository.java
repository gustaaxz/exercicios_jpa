package com.weg.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.jpa.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
