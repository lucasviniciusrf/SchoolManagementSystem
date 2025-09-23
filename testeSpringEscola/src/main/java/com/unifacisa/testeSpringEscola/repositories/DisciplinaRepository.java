package com.unifacisa.testeSpringEscola.repositories;

import com.unifacisa.testeSpringEscola.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina,Long> {
}
