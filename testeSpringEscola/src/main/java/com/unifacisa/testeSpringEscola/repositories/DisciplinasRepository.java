package com.unifacisa.testeSpringEscola.repositories;

import com.unifacisa.testeSpringEscola.entities.Disciplinas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinasRepository extends JpaRepository<Disciplinas,Long> {
}
