package com.unifacisa.testeSpringEscola.services;

import com.unifacisa.testeSpringEscola.entities.HistoricoAluno;
import com.unifacisa.testeSpringEscola.repositories.HistoricoAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoAlunoServices {
    @Autowired
    private HistoricoAlunoRepository historicoAlunoRepository;

    public HistoricoAluno cadastrarHistorico(HistoricoAluno historicoCadastrar){
        return historicoAlunoRepository.save(historicoCadastrar);
    }

    public List<HistoricoAluno>listarHistorico(){
        return historicoAlunoRepository.findAll();
    }
}
