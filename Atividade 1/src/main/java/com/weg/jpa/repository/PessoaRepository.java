package com.weg.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.jpa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
