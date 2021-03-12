# EnvioPromocoesClientesJob - Spring Batch
Projeto Java utilizando Spring Boot.

## Objetivo
Ler dados interesses de clientes em determinados produto e enviar e-mails com promoções sobre esses produtos.
Esse envio de e-mail é executado várias vezes através de um Quartz.

## Reader
Os dados nesse caso são lidos através do JDBC Cursor para um banco de dados MySql.

## Processor
Através da implementação do ItemProcessor que devolve um SimpleMailMessage, temos o processamento do e-mail que será enviado a cada cliente.

## Writer
Através da criação da classe escritora utilizando o SimpleMailItemWriter, e a configuração do servidor de e-mail no *application.properties* temos o mapeamento automatico e fácil para o envio de e-mails.

Cada interesse será enviado um e-mail para o cliente.

## Utilização
Após realizar o 'fork/clone', execute o arquivo __/files/scripts.sql__ para criação do banco, tabelas e registros.

Não esqueça de configurar usuário e senha do banco no arquivo de properties do projeto. Mas caso queira mudar a implementação da base, ou o tipo do BD, basta mudar os apontamentos:

- pom.xml
- application.properties
- DataSourceConfig.java
