package com.unifacisa.testeSpringEscola.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @OneToMany (mappedBy = "aluno", cascade = CascadeType.ALL)

    private List<Disciplina> disciplinas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "reitor_id")
    @JsonIgnore
    private Reitor reitor;

    @ManyToMany(mappedBy = "alunoReitor")
    @JsonIgnore
    private List<Reitor> reitorandoAluno = new ArrayList<>();

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private HistoricoAluno historicoAluno;
 }
