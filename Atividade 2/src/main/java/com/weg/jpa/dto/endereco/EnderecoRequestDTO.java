package com.weg.jpa.dto.endereco;

import com.weg.jpa.dto.funcionario.FuncionarioResponseDTO;

public record EnderecoRequestDTO(
    String rua,
    Long numero,
    FuncionarioResponseDTO funcionario
) {
    
}
