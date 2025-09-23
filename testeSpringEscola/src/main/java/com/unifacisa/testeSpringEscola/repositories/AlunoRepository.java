package com.unifacisa.testeSpringEscola.repositories;

import com.unifacisa.testeSpringEscola.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {
}
