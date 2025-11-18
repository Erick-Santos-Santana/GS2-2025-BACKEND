package com._GS2SEM.enchentes_api.controllers;

import com._GS2SEM.enchentes_api.models.Controle;
import com._GS2SEM.enchentes_api.services.ControleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controle")
public class ControleController {
    private final ControleService service;

    public ControleController(ControleService service) {
        this.service = service;
    }

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
