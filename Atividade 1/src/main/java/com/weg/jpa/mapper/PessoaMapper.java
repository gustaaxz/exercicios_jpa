package com.weg.jpa.mapper;

import org.springframework.stereotype.Component;

import com.weg.jpa.dto.pessoa.PessoaRequestDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.model.Pessoa;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaMapper {
    
    private final DocumentoMapper documentoMapper;

    public Pessoa toEntity(PessoaRequestDTO requestDTO) {
        return new Pessoa(
            requestDTO.nome(),
            requestDTO.documento() != null ? documentoMapper.toEntity(requestDTO.documento()) : null
        );
    }

    public PessoaResponseDTO toResponse(Pessoa pessoa) {
        return new PessoaResponseDTO(
            pessoa.getId(),
            pessoa.getNome(),
            pessoa.getDocumento() != null ? documentoMapper.toResponse(pessoa.getDocumento()) : null
        );
    }
}