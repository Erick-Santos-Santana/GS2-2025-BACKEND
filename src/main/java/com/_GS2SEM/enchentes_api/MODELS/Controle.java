package com._GS2SEM.enchentes_api.MODELS;

@Entity
public class Controle {
    @Id @GeneratedValue
    private Long id;
    private String acao; // "ativar_barreira", "registro_historico"
    private String descricao;
    private LocalDateTime timestamp;
    // getters e setters
}

