package com._GS2SEM.enchentes_api.services;

@Service
public class AlertaService {
    @Autowired private AlertaRepository repo;

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

