package com.weg.jpa.controller;

import org.springframework.web.bind.annotation.*;
import com.weg.jpa.dto.funcionario.FuncionarioRequestDTO;
import com.weg.jpa.dto.funcionario.FuncionarioResponseDTO;
import com.weg.jpa.service.FuncionarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/funcionario")
@RequiredArgsConstructor
public class FuncionarioController {
    
    private final FuncionarioService service;

    @PostMapping
    public FuncionarioResponseDTO cadastrarFuncionario(@RequestBody FuncionarioRequestDTO requestDTO) {
        try {
            return service.postFuncionario(requestDTO);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public FuncionarioResponseDTO buscarFuncionario(@PathVariable Long id) {
        try {
            return service.getFuncionario(id);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
