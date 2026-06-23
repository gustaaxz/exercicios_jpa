package com.weg.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.jpa.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    boolean existsByNumero(Long numero);
}
