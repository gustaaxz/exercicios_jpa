package com.weg.jpa.service;

import org.springframework.stereotype.Service;

import com.weg.jpa.dto.documento.DocumentoRequestDTO;
import com.weg.jpa.dto.documento.DocumentoResponseDTO;
import com.weg.jpa.dto.pessoa.PessoaResponseDTO;
import com.weg.jpa.mapper.DocumentoMapper;
import com.weg.jpa.mapper.PessoaMapper;
import com.weg.jpa.model.Documento;
import com.weg.jpa.model.Pessoa;
import com.weg.jpa.repository.DocumentoRepository;
import com.weg.jpa.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocumentoService {

    private final DocumentoRepository repository;
    private final PessoaRepository pessoaRepository;
    private final DocumentoMapper mapper;
    private final PessoaMapper pessoaMapper;

    public DocumentoResponseDTO postDocumento(DocumentoRequestDTO requestDTO){
        if(repository.existsByNumero(requestDTO.numero())){
            throw new RuntimeException("Documento com este número já cadastrado!");
        }
        
        Documento documento = mapper.toEntity(requestDTO);
        repository.save(documento);
        return mapper.toResponse(documento);
    }

    public DocumentoResponseDTO getDocumento(Long id){
        Documento documento = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Documento não encontrado!"));

        return mapper.toResponse(documento);
    }

    public PessoaResponseDTO getDocumentoPorPessoa(Long pessoaId){
        Pessoa pessoa = pessoaRepository.findById(pessoaId)
            .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!"));

        Documento documento = pessoa.getDocumento();
        if (documento == null) {
            throw new RuntimeException("Esta pessoa não possui documento cadastrado!");
        }

        return pessoaMapper.toResponse(pessoa);
    }
}
