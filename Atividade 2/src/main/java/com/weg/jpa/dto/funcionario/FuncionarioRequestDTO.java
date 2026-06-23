package com.weg.jpa.dto.funcionario;

import com.weg.jpa.dto.endereco.EnderecoResponseDTO;

public record FuncionarioRequestDTO(
    String nome,
    EnderecoResponseDTO endereco
) {
    
}
