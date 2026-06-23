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
        return service.postPessoa(requestDTO);
    }

    @GetMapping("/{id}")
    public PessoaResponseDTO buscarPessoa(@PathVariable Long id){
        return service.getPessoa(id);
    }

}
