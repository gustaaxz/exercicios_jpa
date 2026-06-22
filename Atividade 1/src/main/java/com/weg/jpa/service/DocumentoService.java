package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.dto.documento.DocumentoRequestDTO;
import com.weg.jpa.dto.documento.DocumentoResponseDTO;
import com.weg.jpa.mapper.DocumentoMapper;
import com.weg.jpa.model.Documento;
import com.weg.jpa.repository.DocumentoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocumentoService {

    private final DocumentoRepository repository;
    private final DocumentoMapper mapper;

    public DocumentoResponseDTO postDocumento(DocumentoRequestDTO requestDTO){
        Documento documento = mapper.toEntity(requestDTO);
        repository.save(documento);
        return mapper.toResponse(documento);
    }

}
