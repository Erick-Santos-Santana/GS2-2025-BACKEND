package com._GS2SEM.enchentes_api.services;

@Service
public class ControleService {
    @Autowired private ControleRepository repo;

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
