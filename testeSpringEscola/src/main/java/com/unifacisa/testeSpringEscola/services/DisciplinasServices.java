package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.Disciplinas;
import com.unifacisa.testeSpringEscola.repositories.DisciplinasRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Service
public class DisciplinasServices {
    private DisciplinasRepository disciplinasRepository;

    public Disciplinas cadastrarDisciplinas(Disciplinas disciplinasCadastrar){
        return disciplinasRepository.save(disciplinasCadastrar);
    }

    public List<Disciplinas>listarDisciplinas(){
        return disciplinasRepository.findAll();
    }

    public DisciplinasRepository getDisciplinasRepository() {
        return disciplinasRepository;
    }

    public void setDisciplinasRepository(DisciplinasRepository disciplinasRepository) {
        this.disciplinasRepository = disciplinasRepository;
    }

    // a estrutura segue a mesma para services e controllers:
    // public + (nome da propria classe) + parametro com o anterior + return + nome do anterior
    // nome do anterior significa se for service o anterior é ...Repository por exemplo
}
