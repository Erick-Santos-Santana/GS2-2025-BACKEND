package com._GS2SEM.enchentes_api.controllers;

import com._GS2SEM.enchentes_api.models.Sensor;
import com._GS2SEM.enchentes_api.services.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {
    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping
    public List<Sensor> listar() {
        return service.listar();
    }
}
