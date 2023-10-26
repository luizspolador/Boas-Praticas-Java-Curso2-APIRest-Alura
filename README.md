<h3> Otimizações na camada de persistência: </h3>

Removido redundancias como a remoção de anotações @Column como o mesmo nome do atributo. 
Foi otimizado os relacionamentos trabalhando com Eager e Fetch. 

As consultas com o banco de dados foram otimizadas trabalhando com a construção de métodos nas  interfaces que herdam de JpaRepository. O objetivo nesse caso foi substituir, nas classes de Validacao, a consulta de todo o banco pelo método findAll por um método que faz a consulta no banco de dados passando os parâmetros desejados. 

Criados construtores nas entidades para a instanciação de objetos na camada Service e removido os métodos setters.
