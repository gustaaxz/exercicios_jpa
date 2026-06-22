package com.weg.jpa.mapper;

import org.springframework.stereotype.Component;

import com.weg.jpa.dto.documento.DocumentoRequestDTO;
import com.weg.jpa.dto.documento.DocumentoResponseDTO;
import com.weg.jpa.model.Documento;

@Component
public class DocumentoMapper {
    public Documento toEntity(DocumentoRequestDTO requestDTO){
        return new Documento(
            requestDTO.numero(),
            requestDTO.tipo()
        );
    }

    public DocumentoResponseDTO toResponse(Documento documento){
        return new DocumentoResponseDTO(
            documento.getId(),
            documento.getNumero(),
            documento.getTipo()
        );
    }
}
