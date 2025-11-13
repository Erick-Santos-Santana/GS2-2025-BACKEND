package com._GS2SEM.enchentes_api.MODELS;

@Entity
public class Sensor {
    @Id @GeneratedValue
    private Long id;
    private String tipo; // "nivel_agua" ou "clima"
    private double valor;
    private LocalDateTime timestamp;
    // getters e setters
}
