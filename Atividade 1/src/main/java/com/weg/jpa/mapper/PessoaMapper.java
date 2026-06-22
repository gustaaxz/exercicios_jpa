package com.weg.jpa.mapper;

import org.springframework.stereotype.Component;

import com.weg.jpa.dto.pessoa.PessoaRequestDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.model.Pessoa;

@Component
public class PessoaMapper {
    public Pessoa toEntity(PessoaRequestDTO requestDTO){
        return new Pessoa(
            requestDTO.nome(),
            requestDTO.documento()
        );
    }

    public PessoaResponseDTO toResponse(Pessoa pessoa){
        return new PessoaResponseDTO(
            pessoa.getId(),
            pessoa.getNome(),
            pessoa.getDocumento()
        );
    }
}
