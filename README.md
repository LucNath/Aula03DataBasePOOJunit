# 📚 Aula 03 — Database + POO + JUnit

Projeto desenvolvido como parte das atividades acadêmicas da disciplina de **Programação Orientada a Objetos (POO)**, integrando conceitos de **banco de dados relacional** e **testes automatizados com JUnit**.

---

## 🧠 Objetivos

- Aplicar os princípios de **Programação Orientada a Objetos** (encapsulamento, herança, polimorfismo e abstração)
- Integrar uma aplicação Java com um **banco de dados** via JDBC ou framework ORM
- Escrever e executar **testes unitários** com a biblioteca **JUnit**

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| Java | Linguagem principal do projeto |
| JUnit | Framework de testes unitários |
| JDBC / ORM | Integração com banco de dados |
| SQL | Linguagem de consulta ao banco |
| Maven / Gradle | Gerenciamento de dependências *(se aplicável)* |

---

## 📁 Estrutura do Projeto

```
Aula03DataBasePOOJunit/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── model/         # Classes de domínio (entidades)
│   │       ├── dao/           # Camada de acesso a dados (DAO)
│   │       └── service/       # Regras de negócio
│   └── test/
│       └── java/              # Testes JUnit
├── pom.xml                    # Configuração Maven (se aplicável)
└── README.md
```

---

## ▶️ Como Executar

### Pré-requisitos

- **Java JDK 11+** instalado
- **Maven** ou **Gradle** (conforme o projeto)
- Banco de dados configurado (ex: MySQL, PostgreSQL, H2)

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/LucNath/Aula03DataBasePOOJunit.git
   cd Aula03DataBasePOOJunit
   ```

2. Configure o banco de dados no arquivo de propriedades (ex: `application.properties` ou `db.properties`):
   ```properties
   db.url=jdbc:mysql://localhost:3306/nome_do_banco
   db.user=seu_usuario
   db.password=sua_senha
   ```

3. Compile e execute o projeto:
   ```bash
   mvn clean install
   mvn exec:java
   ```

---

## 🧪 Executando os Testes

Para rodar os testes JUnit:

```bash
mvn test
```

Os resultados dos testes serão exibidos no terminal e salvos em `target/surefire-reports/`.

---

## 📖 Conceitos Abordados

- **Encapsulamento** — atributos privados com getters e setters
- **Herança e Polimorfismo** — reutilização e extensão de comportamentos
- **Padrão DAO** — separação entre lógica de negócio e acesso a dados
- **CRUD com JDBC** — Create, Read, Update e Delete no banco de dados
- **Testes unitários** — validação de comportamentos com JUnit 4/5

---

## 👨‍💻 Autor

**LucNath**  
🔗 [github.com/LucNath](https://github.com/LucNath)

---

## 📄 Licença

Este projeto é de criação pessoal. Consulte o autor para mais informações sobre uso e distribuição.
