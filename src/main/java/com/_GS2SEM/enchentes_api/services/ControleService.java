package com._GS2SEM.enchentes_api.services;

import com._GS2SEM.enchentes_api.models.Controle;
import com._GS2SEM.enchentes_api.repositories.ControleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ControleService {
    private final ControleRepository repo;

    public ControleService(ControleRepository repo) {
        this.repo = repo;
    }

    public Controle ativarBarreira() {
        Controle c = new Controle();
        c.setAcao("ativar_barreira");
        c.setDescricao("Barreira ativada automaticamente");
        c.setTimestamp(LocalDateTime.now());
        return repo.save(c);
    }

    public Controle registrarHistorico(String descricao) {
        Controle c = new Controle();
        c.setAcao("registro_historico");
        c.setDescricao(descricao);
        c.setTimestamp(LocalDateTime.now());
        return repo.save(c);
    }

    public List<Controle> listar() {
        return repo.findAll();
    }
}
