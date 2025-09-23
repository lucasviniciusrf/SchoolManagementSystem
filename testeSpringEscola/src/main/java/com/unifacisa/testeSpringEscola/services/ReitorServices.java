package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.Reitor;
import com.unifacisa.testeSpringEscola.repositories.ReitorRepository;
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
public class ReitorServices {
    private ReitorRepository reitorRepository;

    public Reitor cadastrarReitor(Reitor reitorCadastrar){
        return reitorRepository.save(reitorCadastrar);
    }

    public List<Reitor>listarReitor(){
        return reitorRepository.findAll();
    }

    public ReitorRepository getReitorRepository() {
        return reitorRepository;
    }

    public void setReitorRepository(ReitorRepository reitorRepository) {
        this.reitorRepository = reitorRepository;
    }
}
