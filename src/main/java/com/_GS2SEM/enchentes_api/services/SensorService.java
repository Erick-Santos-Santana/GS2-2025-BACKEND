package com._GS2SEM.enchentes_api.services;

import com._GS2SEM.enchentes_api.models.Sensor;
import com._GS2SEM.enchentes_api.repositories.SensorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SensorService {
    private final SensorRepository repo;

    public SensorService(SensorRepository repo) {
        this.repo = repo;
    }

    public Sensor salvar(Sensor sensor) {
        sensor.setTimestamp(LocalDateTime.now());
        return repo.save(sensor);
    }

    public List<Sensor> listar() {
        return repo.findAll();
    }
}
