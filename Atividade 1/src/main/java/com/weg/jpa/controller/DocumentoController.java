package com.weg.jpa.controller;

import org.springframework.web.bind.annotation.*;

import com.weg.jpa.dto.documento.DocumentoRequestDTO;
import com.weg.jpa.dto.documento.DocumentoResponseDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.service.DocumentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/documento")
@RequiredArgsConstructor
public class DocumentoController {
    
    private final DocumentoService service;

    @PostMapping
    public DocumentoResponseDTO cadastrarDocumento(@RequestBody DocumentoRequestDTO requestDTO){
        return service.postDocumento(requestDTO);
    }

    @GetMapping("/{id}")
    public PessoaResponseDTO buscarDocumento(@PathVariable Long id){
        return service.getDocumentoPorPessoa(id);
    }

}
