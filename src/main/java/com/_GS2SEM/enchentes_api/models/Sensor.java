package com._GS2SEM.enchentes_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Sensor {
    @Id
    @GeneratedValue
    private Long id;

    private String tipo; // "nivel_agua" ou "clima"
    private double valor;
    private LocalDateTime timestamp;

    public Sensor() {}

    public Sensor(String tipo, double valor, LocalDateTime timestamp) {
        this.tipo = tipo;
        this.valor = valor;
        this.timestamp = timestamp;
    }

    public Long getId() { return id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
