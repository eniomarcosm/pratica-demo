

# Implementação Restful API com Spring Boot, JWT e o Swagger

Este projeto demonstra a implementação de segurança usando Spring Boot 3.2.3 e Tokens Web JSON (JWT). Ele inclui os seguintes recursos:

## Recursos

- Registro e login de usuário com autenticação JWT.
- Criptografia de senha usando BCrypt.
- Autorização baseada em funções com Spring Security.
- Tratamento personalizado de negação de acesso.
- Mecanismo de logout.
- Token de atualização.
- Criação, atualização e remoção de projetos (com uso de token Bearer).
- Documentação através do Swagger.

## Tecnologias

- Spring Boot 3.2.3
- Spring Security
- Tokens Web JSON (JWT)
- BCrypt
- Maven
- PostgreSQL
- MySQL
- Swagger

## Dependências

Para começar com este projeto, você precisará ter o seguinte instalado em sua máquina local:

- JDK 17+
- Maven 3+


## Compilação e Execução do Projeto

Siga estas etapas para compilar e executar o projeto:

1. Clone o repositório: `git clone https://github.com/eniomarcosm/pratica-demo.git`
2. Navegue até o diretório do projeto: `cd pratica-demo`
3. Criar o banco de dados com o nome `unisced` ou qualquer a sua escolha no PostgreSQL e MySQL.
4. Abra o arquivo `src/resources/application.yaml`.
5. Configure o driver de banco de dados (MySQL e PostgreSQL).
6. Esquema da string de conexão:`jdbc:dbengine://host:port/database` e caso de mudança do nome da base de dados subistitua no `database`
7. Configure a porta e outros elementos do sistema
8. Execute por meio de uma IDE ou;
9. Compile o projeto: `mvn clean install` e execute o projeto: `mvn spring-boot:run`
11. Importe as rotas usando o Postman no arquivo `./Unisced Exame.postman_collection.json` ou siga os passos na secção seguinte para usar o SWAGGER.

## Acesso ao Swagger

Para acessar a documentação da API através do Swagger UI, siga os passos abaixo:

1. Certifique-se de que o projeto está em execução.
2. Abra o navegador e vá para [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).
3. Você verá a interface do Swagger, onde poderá visualizar e interagir com os endpoints da API.

## Observações Adicionais

- Certifique-se de configurar corretamente as informações de conexão com o banco de dados no arquivo `application.yaml`.
- O arquivo `Unisced Exame.postman_collection.json` contém as rotas da API para importar no Postman e testar os endpoints.
- Lembre-se de ajustar as informações de conexão com o banco de dados conforme necessário antes de executar o projeto.
- Para obter mais informações sobre como usar e configurar o Swagger, consulte a documentação oficial em [Swagger Documentation](https://swagger.io/docs/).
- Para informações adicionais sobre como configurar e usar o Spring Boot, consulte a documentação oficial em [Spring Boot Documentation](https://spring.io/projects/spring-boot/docs/3.2.x/reference/html/).

