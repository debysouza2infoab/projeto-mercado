package br.com.senai.infob.backend.projeto_mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.backend.projeto_mercado.models.Alimento;
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

    @PostMapping("/cadastrar")
    public Alimento salvar(@RequestBody Alimento alimento) {
        return alimentoService.salvar(alimento);
    }

    @GetMapping("/listar")
    public List<Alimento> listar() {
        return alimentoService.listar();
    }

    @GetMapping("/buscar-por-id/{id}")
    public Alimento buscarPorId(@PathVariable Integer id) {
        return alimentoService.buscarPorId(id);
    }

    @DeleteMapping("/remover/{id}")
    public String remover(@PathVariable Integer id) {
        return "Alimento removido com sucesso!";
    }

    @PutMapping("/atualizar/{id}")
    public Alimento atualizar(@PathVariable Integer id, @RequestBody Alimento alimento) {
        return alimentoService.atualizar(id, alimento);
    }
}
