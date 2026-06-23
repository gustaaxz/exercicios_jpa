package com.weg.jpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
    private Long id;
    private String rua;
    private Long numero;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public Endereco(String rua, Long numero){
        this.rua = rua;
        this.numero = numero;
    }
}
