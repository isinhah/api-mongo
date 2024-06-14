# API Users

![NPM](https://img.shields.io/npm/l/react)

API REST desenvolvida usando **Java, Java Spring, MongoDB, Maven, Lombok e MapStruct**

Esta API permite cadastrar usuários e seus endereços em um Banco de Dados não relacional.

## Instalação

Pré-requisito: Java 17

1. Clone o repositório:

```bash
git clone https://github.com/isinhah/api-mongo.git
```

2. Instale as dependências com Maven

3. Instale o [MongoDB](https://www.mongodb.com/)

## Execução

1. Inicie a aplicação com Maven no Terminal

```bash
mvn spring-boot:run
```

2. A API será acessível em http://localhost:8080

## Endpoints

A API possui os seguintes Endpoints:

```markdown
GET /user - Retorna o usuário com endereço.

POST /user/{email} - Cria um novo usuário com endereço.

DELETE /user/{email} - Exclui um usuário pelo email.
```

## Autor

Isabel Henrique

https://www.linkedin.com/in/isabel-henrique/