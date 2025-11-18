package com._GS2SEM.enchentes_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Alerta {
    @Id
    @GeneratedValue
    private Long id;

    private String nivel; // "verde", "amarelo", "vermelho"
    private String mensagem;
    private LocalDateTime timestamp;

    public Alerta() {}

    public Long getId() { return id; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
