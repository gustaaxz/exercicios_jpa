package com.weg.jpa.dto.pessoa;

import com.weg.jpa.dto.documento.DocumentoRequestDTO;

public record PessoaRequestDTO(
    String nome,
    DocumentoRequestDTO documento
) {
    
}
