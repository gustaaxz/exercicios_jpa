package com.weg.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.jpa.dto.endereco.EnderecoRequestDTO;
import com.weg.jpa.dto.endereco.EnderecoResponseDTO;
import com.weg.jpa.service.EnderecoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/endereco")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    @PostMapping
    public EnderecoResponseDTO postEndereco(@RequestBody EnderecoRequestDTO requestDTO){
        try {
            return enderecoService.postEndereco(requestDTO);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public EnderecoResponseDTO getEndereco(@PathVariable Long id){
        try {
            return enderecoService.getEndereco(id);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
