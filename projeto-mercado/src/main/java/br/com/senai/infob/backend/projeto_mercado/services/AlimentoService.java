package br.com.senai.infob.backend.projeto_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.backend.projeto_mercado.repositories.AlimentoRepository;

@Service 
public class AlimentoService {
    
    @Autowired 
    private AlimentoRepository alimentoRepository;

    public Long contar() {
        return alimentoRepository.count();
    }
}
