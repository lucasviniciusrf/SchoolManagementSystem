package com.unifacisa.testeSpringEscola.repositories;

import com.unifacisa.testeSpringEscola.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository <Alunos,Long> {
}
