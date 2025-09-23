package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Disciplina;
import com.unifacisa.testeSpringEscola.entities.HistoricoAluno;
import com.unifacisa.testeSpringEscola.services.HistoricoAlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historico")
public class HistoricoAlunoController {

    @Autowired
    private HistoricoAlunoServices historicoAlunoServices;

    @PostMapping
    public HistoricoAluno cadastrarHistorico (@RequestBody HistoricoAluno historicoCadastrar){
        return historicoAlunoServices.cadastrarHistorico(historicoCadastrar);
    }

    @GetMapping
    public List<HistoricoAluno> listarsHistorico(){
        return historicoAlunoServices.listarHistorico();
    }
}

