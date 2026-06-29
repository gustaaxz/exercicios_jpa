package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.mapper.CursoMapper;
import com.weg.jpa.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {
    
    private final CursoRepository repository;
    private final CursoMapper mapper;

}
