package com.weg.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.jpa.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
