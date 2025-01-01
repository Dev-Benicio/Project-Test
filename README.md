#Projeto de Teste do Application.Properties

Este é um projeto de teste que criei para explorar o uso de arquivos externos para armazenar dados sensíveis,
como as configurações de conexão com o banco de dados. O objetivo é possibilitar a troca fácil entre ambientes 
de desenvolvimento (dev) e produção (prod), sem comprometer a segurança.

Durante meus estudos, percebi que no curso que estou fazendo as informações de conexão com o banco de dados estavam "chumbadas"
diretamente no código (em classes como ConnectionFactory.java). Esse método não é seguro, pois expõe dados sensíveis diretamente
no código-fonte. Por isso, decidi testar uma alternativa utilizando arquivos .properties, que permitem separar as configurações do código.

Este projeto foi uma forma de validar o meu entendimento sobre o uso desse mecanismo e de implementar uma solução mais segura e flexível. 
Com isso, é possível manter as configurações do banco de dados fora do código, facilitando a alteração de dados entre diferentes ambientes
e melhorando a segurança.

Além disso, para uma segurança ainda maior, [e bom usar o arquivo .env 

