# Desafio SEA Solutions
<h4>Implemente o back-end para a tela presente no link abaixo<h4>

<p>Figma - Desafio Spring Boot</p>
<p>https://www.figma.com/file/XSBj1iTcsRolkZ9lJdV8zb/Desafio-SpringBoot?node-id=0%3A1</p>
  
  ![11](https://user-images.githubusercontent.com/30321724/146573518-306a8546-c02c-42c9-9784-a3e60dd9674d.PNG)
  
  # Condições para considerado feito:
    * Utilizar Spring Boot versão: 2.5.4;
    * Utilizar o Java 8 ou Java 11;
    * Implementar os serviços Rest;
    * Persistir as informações no banco de dados;
    * Implementar as três entidades e seus relacionamentos: SETOR, CARGO e TRABALHADOR;
    * Fazer o devido tratamento de exceções;
    * Estar de acordo com as regras de negócio;
    * Disponibilizar o código fonte em um repositório do Github;
    * Utilizar Gradle para gerenciamento de dependências;
  
  # Sugestões:
    * Utilizar banco de dados PostgreSQL;
    * Utilizar o Swagger para criar uma documentação da API;
    * Criar uma quantidade mínima de testes unitários;
    * Utilizar os princípios do Clean Code;

  # Regras de negócios:
    - Não deve ser possível cadastrar um setor com o mesmo nome de outro existente;
    - Cargos ficam vinculados a um setor e não podem ser cadastrados em outros setores;
    - Um trabalhador está vinculado a um setor e a um cargo;
    - Não é possível ter dois trabalhadores com mesmo CPF;  
