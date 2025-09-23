package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.Alunos;
import com.unifacisa.testeSpringEscola.repositories.AlunosRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Service
public class AlunosServices {
    private AlunosRepository alunosRepository;

    public Alunos cadastrarAlunos (Alunos alunosCadastrar){
        return alunosRepository.save(alunosCadastrar);
    }
    public List<Alunos> listaAlunos(){
        return alunosRepository.findAll();
    }

    public AlunosRepository getAlunosRepository() {
        return alunosRepository;
    }

    public void setAlunosRepository(AlunosRepository alunosRepository) {
        this.alunosRepository = alunosRepository;
    }


}
