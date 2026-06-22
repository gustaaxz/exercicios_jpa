package com.weg.jpa.dto.pessoa;

import com.weg.jpa.model.Documento;

public record PessoaRequestDTO(
    String nome,
    Documento documento
) {
    
}
