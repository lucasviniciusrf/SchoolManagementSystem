package com.unifacisa.testeSpringEscola.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="historicoAluno")
public class HistoricoAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false,length = 50)
    private String status;

    @OneToOne
    @JoinColumn(name = "AlunoHistorico", unique = true)
    private Aluno aluno;
}
