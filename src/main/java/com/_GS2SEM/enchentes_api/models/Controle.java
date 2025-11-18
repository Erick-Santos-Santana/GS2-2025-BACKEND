package com._GS2SEM.enchentes_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Controle {
    @Id
    @GeneratedValue
    private Long id;

    private String acao;      // "ativar_barreira" ou "registro_historico"
    private String descricao; // texto livre
    private LocalDateTime timestamp;

    public Controle() {}

    public Long getId() { return id; }
    public String getAcao() { return acao; }
    public void setAcao(String acao) { this.acao = acao; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
