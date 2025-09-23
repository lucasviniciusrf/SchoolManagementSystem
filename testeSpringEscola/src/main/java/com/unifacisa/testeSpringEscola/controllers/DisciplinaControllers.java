package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Disciplina;
import com.unifacisa.testeSpringEscola.services.DisciplinaServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping ("/disciplinas")
public class DisciplinaControllers {

    private DisciplinaServices disciplinaServices;


    @PostMapping
    public Disciplina cadastrarDisciplinas (@RequestBody Disciplina disciplinaCadastrar){
        return disciplinaServices.cadastrarDisciplinas(disciplinaCadastrar);
    }

    @GetMapping
    public List<Disciplina> listarDisciplinas(){
        return disciplinaServices.listarDisciplinas();
    }
}
