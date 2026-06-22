package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.dto.pessoa.PessoaRequestDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.mapper.PessoaMapper;
import com.weg.jpa.model.Pessoa;
import com.weg.jpa.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
    
    private final PessoaRepository repository;
    private final PessoaMapper mapper;

    public PessoaResponseDTO postPessoa(PessoaRequestDTO requestDTO){
        Pessoa pessoa = mapper.toEntity(requestDTO);
        repository.save(pessoa);
        return mapper.toResponse(pessoa);
    }

}
