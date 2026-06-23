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
        if(requestDTO.documento() != null && repository.existsByDocumentoNumero(requestDTO.documento().numero())){
            throw new RuntimeException("Este documento já está cadastrado!");
        }
        
        Pessoa pessoa = mapper.toEntity(requestDTO);
        repository.save(pessoa);
        return mapper.toResponse(pessoa);
    }

    public PessoaResponseDTO getPessoa(Long id){
        Pessoa pessoa = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!"));
    
        return mapper.toResponse(pessoa);
    }
}
