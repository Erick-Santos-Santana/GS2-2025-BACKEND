package com._GS2SEM.enchentes_api.controllers;

@RestController
@RequestMapping("/sensores")
public class SensorController {
    @Autowired private SensorService service;

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping
    public List<Sensor> listar() {
        return service.listar();
    }
}
