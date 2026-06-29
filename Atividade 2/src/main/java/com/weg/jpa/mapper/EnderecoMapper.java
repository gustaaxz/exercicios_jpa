package com.weg.jpa.mapper;

import org.springframework.stereotype.Component;
import com.weg.jpa.dto.endereco.EnderecoRequestDTO;
import com.weg.jpa.dto.endereco.EnderecoResponseDTO;
import com.weg.jpa.model.Endereco;

@Component
public class EnderecoMapper {
    public Endereco toEntity(EnderecoRequestDTO requestDTO) {
        return new Endereco(
            requestDTO.rua(),
            requestDTO.numero()
        );
    }

    public EnderecoResponseDTO toResponse(Endereco entity) {
        return new EnderecoResponseDTO(
            entity.getId(),
            entity.getRua(),
            entity.getNumero()
        );
    }
}
