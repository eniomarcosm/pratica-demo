# Implementação RestfulApi com Spring Boot 3.0 e JWT

Este projeto demonstra a implementação de segurança usando Spring Boot 3.2.3 e Tokens Web JSON (JWT). Ele inclui os seguintes recursos:

## Recursos
- Registro e login de usuário com autenticação JWT
- Criptografia de senha usando BCrypt
- Autorização baseada em funções com Spring Security
- Tratamento personalizado de negação de acesso
- Mecanismo de logout
- Token de atualização
- Criação, Actualização e Remoção de Projectos (com uso de token Barier)

## Tecnologias
- Spring Boot 3.2.3
- Spring Security
- Tokens Web JSON (JWT)
- BCrypt
- Maven
- Postgresql
- Msql

## Dependencias
Para começar com este projeto, você precisará ter o seguinte instalado em sua máquina local:
- JDK 17+
- Maven 3+

Para compilar e executar o projeto, siga estas etapas:
1. Clone o repositório: `git clone https://github.com/eniomarcosm/pratica-demo.git`
2. Navegue até o diretório do projeto: `cd pratica-demo`
3. Abra o ficheiro `src/resources/aplication.yaml` e verifique as configurações
4. Adicione o banco de dados "unisced" ao PostgreSQL e MySQL
5. Compile o projeto: `mvn clean install`
6. Execute o projeto: `mvn spring-boot:run`
7. Import as rotas usando o postman no ficheiro `./Unisced Exame.postman_collection.json`

