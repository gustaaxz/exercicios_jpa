package com.weg.jpa.dto.endereco;

import com.weg.jpa.dto.funcionario.FuncionarioResponseDTO;

public record EnderecoResponseDTO(
    Long id,
    String rua,
    Long numero,
    FuncionarioResponseDTO funcionario
) {
    
}
