package com._GS2SEM.enchentes_api.controllers;

@RestController
@RequestMapping("/controle")
public class ControleController {
    @Autowired private ControleService service;

    @PostMapping("/ativar-barreira")
    public Controle ativar() {
        return service.ativarBarreira();
    }

    @PostMapping("/registrar")
    public Controle registrar(@RequestParam String descricao) {
        return service.registrarHistorico(descricao);
    }

    @GetMapping
    public List<Controle> listar() {
        return service.listar();
    }
}

