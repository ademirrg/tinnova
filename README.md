# Tinnova
Necessário ter o mysql server instalado com configuração de root padrão sem senha e na porta 3306, ou você poderá modificar as credenciais no arquivo application.properties.
Estou utilizando um versionador de banco de dados chamado flyway, já possui scripts de criação da tabela de votos e inserção de dados do teste 1 e as tabelas do teste 5, inserindo algumas marcas pre cadastradas que devem ser consumidas pelo frontend durante o cadastro de veículos, assim se imepede de enviar a marca incorreta na persistência de dados.

Para subir a aplicação, é necessário importar o projeto como Maven Project e deixar baixar as dependências, em seguida basta executar a classe principal TinnovaApp.

O Projeto foi feito em Java 11 com Spring Boot.

Segue abaixo os exemplos de requisições com as rotas e corpo de request e response:

=======================================================
Teste 1
=======================================================

URI /test-1/vote/percent/all (recebe todos os cálculos dos votos)
Metodo GET
Ex de resposta:
{
    "nullVotesPercent": 0.05,
    "validVotesPercent": 0.8,
    "blankVotesPercent": 0.15
}

URI /test-1/vote/percent/valid-votes (recebe o cálculo dos votos válidos)
Metodo GET
Ex de resposta:
{
    "nullVotesPercent": null,
    "validVotesPercent": 0.8,
    "blankVotesPercent": null
}

URI /test-1/vote/percent/blank-votes (recebe o cálculo dos votos em branco)
Metodo GET
Ex de resposta:
{
    "nullVotesPercent": null,
    "validVotesPercent": null,
    "blankVotesPercent": 0.15
}

URI /test-1/vote/percent/null-votes (recebe o cálculo dos votos nulos)
Metodo GET
Ex de resposta:
{
    "nullVotesPercent": 0.05,
    "validVotesPercent": null,
    "blankVotesPercent": null
}

=======================================================
Teste 2
=======================================================

URI /test-2/bubble-sort (ordena um array enviado no body no padrão bubble sort)
Metodo POST

Ex de requisição:
{
	"arrayBubbleSort":[12,5,0,8,6]
}

Ex de resposta:
[
    0,
    5,
    6,
    8,
    12
]

=======================================================
Teste 3
=======================================================

URI /test-3/factorial/{integer} (retorna o fatorial do número enviado na URI)
Metodo GET

Ex de resposta:
6

=======================================================
Teste 4
=======================================================

URI test-4/multiple-sum/{integer} (retorna a soma dos múltiplos de 3 e 5 do valor enviado na URI)
Metodo GET

Ex de resposta:
23

=======================================================
Teste 5
=======================================================

URI /test-5/vehicle (retorna uma lista de todos os veículos cadastrados na base)
Metodo GET

Ex de resposta:
[
    {
        "sold": false,
        "created": "2021-09-12T13:48:57.48034",
        "description": "Carro de passeio",
        "modelYear": 2014,
        "brand": "DS",
        "updated": null,
        "vehicle": "DS4"
    },
    {
        "sold": true,
        "created": "2021-09-12T13:49:59.098392",
        "description": "Carro de passeio",
        "modelYear": 2014,
        "brand": "DS",
        "updated": null,
        "vehicle": "DS5"
    },
    {
        "sold": true,
        "created": "2021-09-12T14:19:22.11848",
        "description": "Carro de passeio",
        "modelYear": 2014,
        "brand": "DS",
        "updated": null,
        "vehicle": "DS5"
    }
]

URI /test-5/vehicle/{integer} (retorna um veículo cadastrado na base pelo id informado na URI)
Metodo GET

Ex de resposta:

{
    "sold": false,
    "created": "2021-09-12T13:48:57.48034",
    "description": "Carro de passeio",
    "modelYear": 2014,
    "brand": "DS",
    "updated": null,
    "vehicle": "DS4"
}

URI /test-5/vehicle (cadastra o veículo na base)
Metodo POST

Ex de requisição:
{
	"vehicle":"DS5",
	"brand":"DS",
	"modelYear":2014,
	"description": "Carro de passeio",
	"sold":true	
}

Ex de resposta:

{
    "sold": true,
    "created": null,
    "description": "Carro de passeio",
    "modelYear": 2014,
    "brand": "DS",
    "updated": null,
    "vehicle": "DS5"
}


URI /test-5/vehicle/{integer} (atualiza o veículo na base pelo id enviado na URI)
Metodo PUT

Ex de requisição:
{
	"vehicle":"DS5",
	"brand":"DS",
	"modelYear":2014,
	"description": "Carro de passeio Atualizado 2",
	"sold":false,
}

Ex de resposta:

{
    "sold": false,
    "created": null,
    "description": "Carro de passeio Atualizado 2",
    "modelYear": 2014,
    "brand": "DS",
    "updated": "2021-09-12T16:25:03.423141",
    "vehicle": "DS5"
}

URI /test-5/vehicle/{integer} (atualiza o veículo na base pelo id enviado na URI)
Metodo PATCH

Ex de requisição:
{
	"vehicle":"DS5",
	"brand":"DS",
	"modelYear":2014,
	"description": "Carro de passeio Atualizado 2",
	"sold":false,
}

Ex de resposta:

{
    "sold": false,
    "created": null,
    "description": "Carro de passeio Atualizado 2",
    "modelYear": 2014,
    "brand": "DS",
    "updated": "2021-09-12T16:25:03.423141",
    "vehicle": "DS5"
}

URI /test-5/vehicle/{integer} (deleta o veículo na base pelo id enviado na URI)
Metodo POST

Ex de resposta:
http status 200

URI /test-5/car-brand (retorna uma lista de todas as marcas de veículos cadastradas na base)
Metodo GET

Ex de resposta:

[
    {
        "name": "Nissan"
    },
    {
        "name": "Ford"
    },
    {
        "name": "Chevrolet"
    },
    {
        "name": "Volkswagen"
    },
    {
        "name": "Honda"
    },
    {
        "name": "Hyundai"
    },
    {
        "name": "BMW"
    },
    {
        "name": "Citroen"
    },
    {
        "name": "Peugeot"
    }
]


