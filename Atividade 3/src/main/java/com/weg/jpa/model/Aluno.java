package com.weg.jpa.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aluno")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;

    @ManyToMany
    @JoinTable(
        name = "aluno_curso", // Defino o nome da tabela intermediária
        joinColumns = @JoinColumn(name = "aluno_id"), // Insiro a Coluna "aluno_id" dentro de aluno_curso
        inverseJoinColumns = @JoinColumn(name = "curso_id") // Insiro a Coluna "curso_id" dentro de aluno_curso
    )
    ArrayList<Curso> cursos = new ArrayList<>();
}