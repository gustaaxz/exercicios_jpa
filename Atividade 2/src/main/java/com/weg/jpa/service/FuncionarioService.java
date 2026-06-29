package com.weg.jpa.service;

import org.springframework.stereotype.Service;
import com.weg.jpa.dto.funcionario.FuncionarioRequestDTO;
import com.weg.jpa.dto.funcionario.FuncionarioResponseDTO;
import com.weg.jpa.model.Funcionario;
import com.weg.jpa.repository.FuncionarioRepository;
import com.weg.jpa.mapper.FuncionarioMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;

    public FuncionarioResponseDTO postFuncionario(FuncionarioRequestDTO requestDTO) {
        Funcionario funcionario = mapper.toEntity(requestDTO);
        Funcionario saved = repository.save(funcionario);
        return mapper.toResponse(saved);
    }

    public FuncionarioResponseDTO getFuncionario(Long id) {
        Funcionario funcionario = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Funcionário não encontrado!"));
        return mapper.toResponse(funcionario);
    }
}
