# DESAFIO FULL-STACK
## Gerenciador de Aeronaves
 Projeto tem como objetivo a criação de 2 aplicações para cadastro de aeronaves:

**Back-End:** Aplicação baseada em Spring MVC e JPA que utilize os métodos (GET, POST, PUT e DELETE);

**Front-End:** Desenvolver uma UI que atenda as necessidades do projeto preferencialmente
utilizando o conceito de SPA.

## Tecnologias Utilizadas:
**Back-end:**
* Spring Framework 5.3;
* Swagger(Documentação);

**Banco de Dados:**
* MySQL;

## Requerimentos:
* MySQL (https://dev.mysql.com/downloads/workbench/);
* JDK 1.8 (https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).

## Executando o Projeto:
### 1º - MySql
* 1º. importar utilizando o command:
`mysql -u <user> -p <pass> < database/db_aeronaves.sql`

### 2º - Back-end
* 1º Vá até o arquivo `GerenciadorAeronaves\src\main\resources\application.properties`, edite ele e, nos campos de `spring.datasource.username` e `spring.datasource.password` coloque suas irformações para acessar o Banco de Dados
* 2º. No Terminal, vá até a pasta do projeto e execute o seguinte código:
`mvnw.cmd spring-boot:run`

### Documentação da API:
http://localhost:9090/swagger-ui.html