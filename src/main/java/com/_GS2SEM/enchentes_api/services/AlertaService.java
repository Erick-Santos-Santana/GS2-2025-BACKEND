package com._GS2SEM.enchentes_api.services;

import com._GS2SEM.enchentes_api.models.Alerta;
import com._GS2SEM.enchentes_api.repositories.AlertaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertaService {
    private final AlertaRepository repo;

    public AlertaService(AlertaRepository repo) {
        this.repo = repo;
    }

    public Alerta gerarAlerta(double nivelAgua) {
        String nivel;
        String mensagem;

        if (nivelAgua < 50) {
            nivel = "verde";
            mensagem = "Nível seguro";
        } else if (nivelAgua < 80) {
            nivel = "amarelo";
            mensagem = "Atenção: risco moderado";
        } else {
            nivel = "vermelho";
            mensagem = "Alerta máximo: risco de enchente!";
        }

        Alerta alerta = new Alerta();
        alerta.setNivel(nivel);
        alerta.setMensagem(mensagem);
        alerta.setTimestamp(LocalDateTime.now());
        return repo.save(alerta);
    }

    public List<Alerta> listar() {
        return repo.findAll();
    }
}
