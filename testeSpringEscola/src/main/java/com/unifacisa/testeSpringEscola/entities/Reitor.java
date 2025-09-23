package com.unifacisa.testeSpringEscola.entities;

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
@Table(name="reitor")
public class Reitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;

    @OneToMany (mappedBy = "reitor", cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "reitorandoAluno",
            joinColumns = @JoinColumn(name = "reitor_id"),
            inverseJoinColumns = @JoinColumn(name="aluno_id")
    )
    private List <Aluno> alunoReitor = new ArrayList<>();


}
