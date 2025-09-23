package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.Aluno;
import com.unifacisa.testeSpringEscola.repositories.AlunoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Service
public class AlunoServices {
    private AlunoRepository alunoRepository;

    public Aluno cadastrarAlunos (Aluno alunoCadastrar){
        return alunoRepository.save(alunoCadastrar);
    }
    public List<Aluno> listaAlunos(){
        return alunoRepository.findAll();
    }

    public AlunoRepository getAlunosRepository() {
        return alunoRepository;
    }

    public void setAlunosRepository(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }


}
