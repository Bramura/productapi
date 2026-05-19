# Product API

API REST para gerenciamento de produtos desenvolvida com Java e Spring Boot.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Swagger / OpenAPI
- Maven

---

# Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Busca de produto por ID
- Atualização de produtos
- Remoção de produtos
- Validação de dados
- Tratamento global de exceções
- Documentação automática com Swagger

---

# Estrutura do Projeto

```bash
src/main/java/com/bramura/productapi
│
├── controller
├── service
├── repository
├── model
├── exception
├── config
```

---

# Arquitetura

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

---

# Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| GET | /products | Lista todos os produtos |
| GET | /products/{id} | Busca produto por ID |
| POST | /products | Cria novo produto |
| PUT | /products/{id} | Atualiza produto |
| DELETE | /products/{id} | Remove produto |

---

# Exemplo de JSON

## POST /products

```json
{
  "name": "Notebook Gamer",
  "price": 5500
}
```

---

# Swagger

Documentação disponível em:

```bash
http://localhost:8080/swagger-ui/index.html
```

---

# Como Executar o Projeto

## Clonar repositório

```bash
git clone https://github.com/Bramura/productapi.git
```

---

## Entrar na pasta

```bash
cd productapi
```

---

## Executar aplicação

### Windows PowerShell

```powershell
.\mvnw spring-boot:run
```

---

# Banco H2

Console do banco:

```bash
http://localhost:8080/h2-console
```

## JDBC URL

```bash
jdbc:h2:mem:testdb
```

## User

```bash
sa
```

Senha:
(vazia)

---

# Melhorias Futuras

- Autenticação JWT
- Banco MySQL/PostgreSQL
- Docker
- Deploy em nuvem
- DTOs
- Testes automatizados

---

# Autor

Brayan Miyamura

LinkedIn:
(adicione depois)

GitHub:
https://github.com/Bramura