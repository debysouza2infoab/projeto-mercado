package br.com.senai.infob.backend.projeto_mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.backend.projeto_mercado.services.AlimentoService;

@RestController
@RequestMapping("/alimento")
public class AlimentoController {
    
    @Autowired 
    private AlimentoService alimentoService;

    @GetMapping("/contar")
    public Long contar() {
        return alimentoService.contar();
    }
}
