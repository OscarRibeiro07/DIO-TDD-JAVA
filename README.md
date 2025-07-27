# Projeto de Testes em Java com JUnit

Este repositório contém uma coleção de exemplos de testes unitários escritos em Java, utilizando o framework JUnit 5. O projeto tem como foco o aprendizado de boas práticas em testes automatizados e lógica de programação escalável, passando por diferentes fases de evolução dos testes.

---

## 🧪 Tecnologias utilizadas

- **Java 17+**
- **JUnit 5**
- **Mockito**
- **Maven**
- Organização de branches com **Git Flow**

---

## 📂 Estrutura do Projeto

O projeto é organizado em _features_ seguindo a convenção `Develop --> feature/...`, separando os conteúdos por módulos temáticos de aprendizado:

```plaintext
Develop
├── feature/maven
│   └── Configuração inicial do Maven, estrutura de projeto e dependências.
│
├── feature/intro-testes
│   └── Primeiros testes com Java, lógica básica e testes manuais.
│
├── feature/testes-unitarios-Junit
│   └── Testes com JUnit 5, incluindo:
│       ├── Assertions
│       ├── Assumptions
│       ├── Testes condicionais
│       └── Ordenações de dados
│
├── feature/testes-unitarios-Mokito
│   └── Simulações de comportamento usando Mockito (mocks, stubs).
│
└── feature/logica-escalável
    └── Exercícios e testes aplicados com foco em lógica de programação reutilizável e escalável.
