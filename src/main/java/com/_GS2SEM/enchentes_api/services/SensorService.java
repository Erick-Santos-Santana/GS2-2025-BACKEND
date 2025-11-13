package com._GS2SEM.enchentes_api.services;

@Service
public class SensorService {
    @Autowired private SensorRepository repo;

    public Sensor salvar(Sensor sensor) {
        sensor.setTimestamp(LocalDateTime.now());
        return repo.save(sensor);
    }

    public List<Sensor> listar() {
        return repo.findAll();
    }
}
