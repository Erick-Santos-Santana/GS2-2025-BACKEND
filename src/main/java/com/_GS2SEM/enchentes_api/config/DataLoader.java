package com._GS2SEM.enchentes_api.config;

import com._GS2SEM.enchentes_api.models.Sensor;
import com._GS2SEM.enchentes_api.repositories.SensorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final SensorRepository sensorRepo;

    public DataLoader(SensorRepository sensorRepo) {
        this.sensorRepo = sensorRepo;
    }

    @Override
    public void run(String... args) {
        if (sensorRepo.count() == 0) {
            List<Sensor> sensores = List.of(
                    new Sensor("nivel_agua", 42.5, LocalDateTime.now().minusHours(3)),
                    new Sensor("nivel_agua", 67.8, LocalDateTime.now().minusHours(2)),
                    new Sensor("nivel_agua", 85.3, LocalDateTime.now().minusHours(1)),
                    new Sensor("nivel_agua", 91.0, LocalDateTime.now()),
                    new Sensor("clima", 22.0, LocalDateTime.now().minusHours(3)),
                    new Sensor("clima", 28.5, LocalDateTime.now().minusHours(2)),
                    new Sensor("clima", 19.3, LocalDateTime.now().minusHours(1)),
                    new Sensor("clima", 31.7, LocalDateTime.now())
            );
            sensorRepo.saveAll(sensores);
        }
    }
}
