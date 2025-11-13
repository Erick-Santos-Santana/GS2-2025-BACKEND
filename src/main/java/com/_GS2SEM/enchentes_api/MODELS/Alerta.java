package com._GS2SEM.enchentes_api.MODELS;

@Entity
public class Alerta {
    @Id @GeneratedValue
    private Long id;
    private String nivel; // "verde", "amarelo", "vermelho"
    private String mensagem;
    private LocalDateTime timestamp;
    // getters e setters
}

