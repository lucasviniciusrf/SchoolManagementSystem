package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.Disciplina;
import com.unifacisa.testeSpringEscola.repositories.DisciplinaRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Service
public class DisciplinaServices {
    private DisciplinaRepository disciplinaRepository;

    public Disciplina cadastrarDisciplinas(Disciplina disciplinaCadastrar){
        return disciplinaRepository.save(disciplinaCadastrar);
    }

    public List<Disciplina>listarDisciplinas(){
        return disciplinaRepository.findAll();
    }

    public DisciplinaRepository getDisciplinasRepository() {
        return disciplinaRepository;
    }

    public void setDisciplinasRepository(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    // a estrutura segue a mesma para services e controllers:
    // public + (nome da propria classe) + parametro com o anterior + return + nome do anterior
    // nome do anterior significa se for service o anterior é ...Repository por exemplo
}
