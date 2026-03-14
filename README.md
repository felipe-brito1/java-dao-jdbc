# Java DAO JDBC

Projeto desenvolvido em **Java** com o objetivo de praticar acesso a banco de dados utilizando **JDBC** e o padrão de projeto **DAO (Data Access Object)**.

A aplicação realiza operações de **CRUD** em entidades de um banco de dados relacional, simulando o gerenciamento de vendedores e departamentos.

---

# Tecnologias utilizadas

* Java
* JDBC
* MySQL
* SQL
* Padrão DAO
* Git / GitHub

---

# Estrutura do projeto

O projeto foi organizado em camadas para separar responsabilidades


# Funcionalidades

O projeto implementa operações completas de banco de dados:

### Inserção

Inserção de novos vendedores e departamentos.

### Busca por ID

Busca de registros específicos utilizando o identificador.

### Busca por departamento

Consulta de vendedores pertencentes a um determinado departamento.

### Listagem completa

Listagem de todos os vendedores ou departamentos cadastrados.

### Atualização

Alteração de dados de registros existentes.

### Exclusão

Remoção de registros do banco de dados.

---

# Conceitos aplicados

Durante o desenvolvimento foram aplicados conceitos importantes de backend:

* Conexão com banco usando JDBC
* Uso de `PreparedStatement`
* Manipulação de `ResultSet`
* Separação de responsabilidades com **DAO**
* Tratamento de exceções
* Organização de código em camadas
* Relacionamento entre entidades

---

# Banco de dados

O projeto utiliza um banco de dados relacional com as seguintes tabelas principais:

## Department

| Id | Name |
| -- | ---- |

## Seller

| Id | Name | Email | BirthDate | BaseSalary | DepartmentId |

O campo `DepartmentId` representa o relacionamento entre vendedor e departamento.

---

# Como executar o projeto

1. Clonar o repositório

```
git clone https://github.com/felipe-brito1/java-dao-jdbc
```

2. Configurar o banco de dados MySQL.

3. Ajustar as configurações de conexão no arquivo:

```
db.properties
```

4. Executar a classe:

```
Program.java
```

---

# Objetivo do projeto

Este projeto foi desenvolvido com fins de estudo para consolidar conhecimentos em:

* Java backend
* JDBC
* SQL
* Arquitetura baseada em DAO

---

# Autor

Felipe Brito

GitHub:
https://github.com/felipe-brito1
