package com.unifacisa.testeSpringEscola.repositories;

import com.unifacisa.testeSpringEscola.entities.HistoricoAluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoAlunoRepository extends JpaRepository<HistoricoAluno,Long> {
}
