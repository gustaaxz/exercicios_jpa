package com.weg.jpa.dto.pessoa;

import com.weg.jpa.model.Documento;

public record PessoaResponseDTO(
    Long id,
    String nome,
    Documento documento
) {
    
}
