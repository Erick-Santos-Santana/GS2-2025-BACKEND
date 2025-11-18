package com._GS2SEM.enchentes_api.controllers;

import com._GS2SEM.enchentes_api.models.Alerta;
import com._GS2SEM.enchentes_api.services.AlertaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
public class AlertaController {
    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @PostMapping("/gerar")
    public Alerta gerar(@RequestParam double nivelAgua) {
        return service.gerarAlerta(nivelAgua);
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }
}
