# Sistema-Hospedagem
Um sistema parecido com o Airbnb em Java

# Sistema de Hospedagem

Este é um projeto em Java que tem como objetivo criar um sistema de hospedagem para gerenciar propriedades e reservas de hospedes.

## Como usar
##Requisitos

    .Java 8 ou superior
    .Git
    
## Passo a passo

    Clone o repositório:git clone https://github.com/GabrielOliveira04/Sistema-Hospedagem.git
    Abra o projeto em sua IDE preferida (recomendamos o Eclipse).
    Compile e execute a classe Main para rodar o sistema.
    Siga as instruções no console para interagir com o sistema.

## Funcionalidades

### O sistema conta com as seguintes funcionalidades:

    Cadastrar uma propriedade: é possível cadastrar uma propriedade informando seu nome, endereço, número de quartos, preço por noite e tipo (apartamento ou casa).

    Listar propriedades: é possível listar todas as propriedades cadastradas no sistema.

    Cadastrar hospede: é possível cadastrar um hospede informando seu nome, email e telefone.

    Listar hospedes: é possível listar todos os hospedes cadastrados no sistema.

    Fazer reserva: é possível fazer uma reserva informando a propriedade, o hospede, as datas de check-in e check-out e o preço total da reserva.

    Listar reservas: é possível listar todas as reservas feitas no sistema.

    Cadastrar avaliação: é possível cadastrar uma avaliação para uma propriedade, informando o hospede que fez a avaliação, a nota (de 1 a 5) e um comentário.

    Listar avaliações: é possível listar todas as avaliações feitas para uma determinada propriedade.

    Calcular média de avaliações: é possível calcular a média de avaliações para uma determinada propriedade.
    
    
 ## Arquitetura do projeto

### O projeto foi desenvolvido seguindo o padrão de arquitetura MVC (Model-View-Controller), que separa as responsabilidades de modelagem de dados, apresentação de informações e controle de fluxo.

    Model: representado pelas classes Propriedade, Hospede, Reserva e Avaliacao, são responsáveis por representar as entidades do sistema.

    View: representado pela classe Main, é responsável por receber as entradas do usuário e apresentar as informações para o usuário.

    Controller: não há uma classe específica para representar o controlador no sistema, mas as responsabilidades de controle de fluxo são realizadas diretamente pela classe Main, 
    que coordena a interação entre as classes de modelo e as ações do usuário.   
    
    
 ## Conclusão

Este é um projeto simples, mas que mostra como é possível criar um sistema de hospedagem utilizando a linguagem Java e seguindo as boas práticas de arquitetura de software.
Ele pode ser utilizado como ponto de partida para a criação de sistemas mais complexos e para o aprimoramento das habilidades em programação orientada a objetos e padrões de projeto.   
    
