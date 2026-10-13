package br.com.senai.infob.backend.projeto_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.backend.projeto_mercado.models.Alimento;
import br.com.senai.infob.backend.projeto_mercado.repositories.AlimentoRepository;

@Service 
public class AlimentoService {
    
    @Autowired 
    private AlimentoRepository alimentoRepository;

    public Long contar() {
        return alimentoRepository.count();
    }

    public Alimento salvar(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    public List<Alimento> listar() {
        return alimentoRepository.findAll();
    }

    public Alimento buscarPorId(Integer id) {
        return alimentoRepository.findById(id).get();
    }

    public void remover(Integer id) {
        alimentoRepository.deleteById(id);
    }

    public Alimento atualizar(Integer id, Alimento alimento) {
        return alimentoRepository.save(alimento);
    }
}
