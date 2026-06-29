package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.dto.endereco.EnderecoRequestDTO;
import com.weg.jpa.dto.endereco.EnderecoResponseDTO;
import com.weg.jpa.mapper.EnderecoMapper;
import com.weg.jpa.model.Endereco;
import com.weg.jpa.repository.EnderecoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    
    private final EnderecoRepository repository;
    private final EnderecoMapper mapper;

    public EnderecoResponseDTO postEndereco(EnderecoRequestDTO requestDTO){
        Endereco endereco = mapper.toEntity(requestDTO);
        repository.save(endereco);
        return mapper.toResponse(endereco);
    }

    public EnderecoResponseDTO getEndereco(Long id){
        Endereco endereco = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Endereço não encontrado!"));
        return mapper.toResponse(endereco);
    }
}
