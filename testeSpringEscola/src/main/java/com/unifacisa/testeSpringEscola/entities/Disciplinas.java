package com.unifacisa.testeSpringEscola.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "disciplinas")
public class Disciplinas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeDisciplina;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    @JsonIgnoreProperties("disciplinas")    // evita loop infinito
    private Alunos aluno;

}
