package com.weg.jpa.dto.funcionario;

import com.weg.jpa.dto.endereco.EnderecoRequestDTO;

public record FuncionarioRequestDTO(
    String nome,
    EnderecoRequestDTO endereco
) {
    
}
