package com.weg.jpa.dto.pessoa;

import com.weg.jpa.dto.documento.DocumentoResponseDTO;

public record PessoaResponseDTO(
    Long id,
    String nome,
    DocumentoResponseDTO documento
) {
    
}
