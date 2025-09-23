package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Aluno;
import com.unifacisa.testeSpringEscola.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControllers {

    @Autowired
    private AlunoServices alunoServices;

    @PostMapping
    public Aluno cadastrarAlunos (@RequestBody Aluno alunoCadastrar){
        return alunoServices.cadastrarAlunos(alunoCadastrar);
    }

    @GetMapping
    public List<Aluno> listarAlunos (){
        return alunoServices.listaAlunos();
    }

}
