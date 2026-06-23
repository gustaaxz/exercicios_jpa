package com.weg.jpa.controller;

import org.springframework.web.bind.annotation.*;

import com.weg.jpa.dto.pessoa.PessoaRequestDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.service.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {
    
    private final PessoaService service;

    @PostMapping
    public PessoaResponseDTO cadastrarPessoa(@RequestBody PessoaRequestDTO requestDTO){
        try {
            return service.postPessoa(requestDTO);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public PessoaResponseDTO buscarPessoa(@PathVariable Long id){
        try {
            return service.getPessoa(id);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
