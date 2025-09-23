package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Disciplinas;
import com.unifacisa.testeSpringEscola.repositories.DisciplinasRepository;
import com.unifacisa.testeSpringEscola.services.DisciplinasServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping ("/disciplinas")
public class DisciplinasControllers {

    private DisciplinasServices disciplinasServices;


    @PostMapping
    public Disciplinas cadastrarDisciplinas (@RequestBody Disciplinas disciplinasCadastrar){
        return disciplinasServices.cadastrarDisciplinas(disciplinasCadastrar);
    }

    @GetMapping
    public List<Disciplinas> listarDisciplinas(){
        return disciplinasServices.listarDisciplinas();
    }
}
