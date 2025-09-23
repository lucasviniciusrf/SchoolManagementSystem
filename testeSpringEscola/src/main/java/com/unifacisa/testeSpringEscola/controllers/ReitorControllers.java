package com.unifacisa.testeSpringEscola.controllers;

import com.unifacisa.testeSpringEscola.entities.Reitor;
import com.unifacisa.testeSpringEscola.services.ReitorServices;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reitor")
public class ReitorControllers {

    @Autowired
    private ReitorServices reitorServices;

    @PostMapping
    public Reitor cadastrarReitor(@RequestBody Reitor reitorCadastrar){
        return reitorServices.cadastrarReitor(reitorCadastrar);
    }

    @GetMapping
    public List<Reitor> listarReitor(){
        return reitorServices.listarReitor();
    }
}
