package com.weg.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.jpa.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
