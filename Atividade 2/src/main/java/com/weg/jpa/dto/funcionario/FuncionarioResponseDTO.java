package com.weg.jpa.dto.funcionario;

import com.weg.jpa.dto.endereco.EnderecoResponseDTO;

public record FuncionarioResponseDTO(
    Long id,
    String nome,
    EnderecoResponseDTO endereco
) {
    
}
