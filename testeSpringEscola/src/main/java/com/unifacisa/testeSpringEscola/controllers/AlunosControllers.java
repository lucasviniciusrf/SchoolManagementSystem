package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Alunos;
import com.unifacisa.testeSpringEscola.services.AlunosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosControllers {

    @Autowired
    private AlunosServices alunosServices;

    @PostMapping
    public Alunos cadastrarAlunos (@RequestBody Alunos alunosCadastrar){
        return alunosServices.cadastrarAlunos(alunosCadastrar);
    }

    @GetMapping
    public List<Alunos> listarAlunos (){
        return alunosServices.listaAlunos();
    }

}
