Refatorado o código utilizando o princípio da responsabilidade única. Além disso, o strategy também foi implementado por meio da criação de classes que fazem validações.

Também foi aplicado o padrão Chain of Reponsability. Foi criada uma interface para que todos as classes Validacao faça a sua implementação. Posteriormente, foi injetado na classe AdocaoService uma lista passando como generic a interface criada, dessa forma, não sendo necessário a injeção de cada Validador na classe AdocaoService.
