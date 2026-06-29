package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.mapper.AlunoMapper;
import com.weg.jpa.repository.AlunoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {
    
    private final AlunoRepository repository;
    private final AlunoMapper mapper;

}
