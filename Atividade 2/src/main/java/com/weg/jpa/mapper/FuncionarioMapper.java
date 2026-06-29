package com.weg.jpa.mapper;

import org.springframework.stereotype.Component;
import com.weg.jpa.dto.funcionario.FuncionarioRequestDTO;
import com.weg.jpa.dto.funcionario.FuncionarioResponseDTO;
import com.weg.jpa.model.Endereco;
import com.weg.jpa.model.Funcionario;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FuncionarioMapper {

    private final EnderecoMapper enderecoMapper;

    public Funcionario toEntity(FuncionarioRequestDTO requestDTO) {
        Funcionario funcionario = new Funcionario(requestDTO.nome());
        if (requestDTO.endereco() != null) {
            Endereco endereco = enderecoMapper.toEntity(requestDTO.endereco());
            endereco.setFuncionario(funcionario);
            funcionario.setEndereco(endereco);
        }
        return funcionario;
    }

    public FuncionarioResponseDTO toResponse(Funcionario entity) {
        return new FuncionarioResponseDTO(
            entity.getId(),
            entity.getNome(),
            enderecoMapper.toResponse(entity.getEndereco())
        );
    }
}
