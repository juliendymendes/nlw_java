
# API de Certificações

Projeto de certificações desenvolvido durante a NLW

## Tabela de Conteúdos
1. [Pré-requisitos](#pré-requisitos)
2. [Como Rodar a Aplicação](#como-rodar-a-aplicação)
3. [Tecnologias Utilizadas](#tecnologias-utilizadas)

## Pré-requisitos
Antes de começar, verifique se você tem instalado em sua máquina:
- Java JDK 8 ou superior
- Maven 3.x ou superior
- IDE (como IntelliJ IDEA, Eclipse, etc.) ou Editor de Texto (como VSCode) para facilitar o desenvolvimento
- Docker e Docker Compose

## Como Rodar a Aplicação
1. Clone este repositório para sua máquina local usando `git clone https://github.com/juliendymendes/nlw_java`
2. Navegue até o diretório do projeto usando o terminal ou prompt de comando: `cd nlw_java`
3. No terminal, execute: `docker compose up -d` 
4. Em seguida, execute: `mvn spring-boot:run`
5. A aplicação estará disponível em `http://localhost:8080`

## Tecnologias Utilizadas
- Spring Boot
- Maven
- Java
- Spring Data JPA
- Hibernate
- Lombok
- PostgreSQL
