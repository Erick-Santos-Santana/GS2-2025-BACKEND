Grupo:
Erick Santos Santana			RM: 559206
Gabriel Trusnovec Mateus 		RM: 550873
Otávio Antônio de Lima Kesan 		RM: 565830

# 🌊 Enchentes API - Backend

Projeto desenvolvido para a disciplina **Técnicas Avançadas de Programação** do curso de Engenharia Mecatrônica da FIAP.

---

## 🎯 Objetivo

Simular um sistema automatizado de detecção, alerta e contenção de enchentes, garantindo mais segurança às comunidades urbanas.

---

## 🧱 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA
- H2 Database (persistente em arquivo)
- Gradle
- IntelliJ IDEA

---

## 📦 Estrutura do Projeto
com._GS2SEM.enchentes_api 
├── controllers 
│ 
├── SensorController.java 
│ 
├── AlertaController.java 
│ 
└── ControleController.java 
├── services 
│ 
├── SensorService.java 
│ 
├── AlertaService.java 
│ 
└── ControleService.java 
├── repositories 
│ 
├── SensorRepository.java 
│ 
├── AlertaRepository.java 
│ 
└── ControleRepository.java 
├── models 
│ 
├── Sensor.java 
│ 
├── Alerta.java 
│ 
└── Controle.java 
├── config 
│ 
└── DataLoader.java 
└── EnchentesApiApplication.java

---

## 🔗 Endpoints da API

### Sensores
- `GET /sensores` → Lista sensores
- `POST /sensores` → Cria sensor

### Alertas
- `GET /alertas` → Lista alertas
- `POST /alertas/gerar?nivelAgua=85` → Gera alerta com base no nível informado

### Controle
- `GET /controle` → Lista ações
- `POST /controle/ativar-barreira` → Simula ativação de barreira
- `POST /controle/registrar?descricao=Texto` → Registra histórico de ações

---

## 🗃️ Banco de Dados

- Banco H2 configurado para persistência em arquivo
- Arquivo gerado: `data/flood-db.mv.db`
- Console disponível em: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:file:./data/flood-db`
- Usuário: `sa`
- Senha: *(vazio)*

---

## ▶️ Como Executar

1. Clonar o repositório
2. Abrir no IntelliJ IDEA
3. Configurar SDK Java 21
4. Sincronizar o Gradle (`Reload Gradle Project`)
5. Rodar `EnchentesApiApplication.java`
6. Testar os endpoints com Postman, Insomnia ou navegador

---

## 👥 Integrantes

- Nome 1 - RM
- Nome 2 - RM
- Nome 3 - RM

---

## 📁 Entrega

- Código-fonte completo
- Arquivo do banco H2 em `/data`
- README com descrição e dados do grupo
