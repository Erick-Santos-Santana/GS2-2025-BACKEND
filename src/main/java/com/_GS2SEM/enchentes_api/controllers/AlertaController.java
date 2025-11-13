package com._GS2SEM.enchentes_api.controllers;

@RestController
@RequestMapping("/alertas")
public class AlertaController {
    @Autowired private AlertaService service;

    @PostMapping("/gerar")
    public Alerta gerar(@RequestParam double nivelAgua) {
        return service.gerarAlerta(nivelAgua);
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }
}
