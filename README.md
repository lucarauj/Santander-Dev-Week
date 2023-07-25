Santander Dev Week - APIs com Java 17, Spring Boot 3 e Railway - Do Zero ao Deploy em Nuvem

## Start do projeto base:

- https://start.spring.io/

## Dependências:

- Spring Web
- Spring Data JPA
- H2 Database
- PostgreSQL Driver

## Objetos da minha aplicação no formato JSON:

```
{
	"name": "Lucas",
	"account": {
		"number": "00000000-0",
		"agency": "0000",
		"balance": 1234.56,
		"limit": 1000.00
	}
	"features": [
		{
			"icon": "URL",
			"description": "Descrição"
		}
	],
	"card": {
		"number": "xxx xxx xxx 000",
		"limit": 1000.00
	},
	"news": [
		{
			"icon": "URL",
			"description": "Descrição"
		}
	]
}
```

## Gerando diagrama de classe Mermaid com chatGPT utilizando JSON:

```mermaid
classDiagram
  class Pessoa {
    + name: string
    + account: Account
    + features: Feature[]
    + card: Card
    + news: News[]
  }

  class Account {
    + number: string
    + agency: string
    + balance: number
    + limit: number
  }

  class Feature {
    + icon: string
    + description: string
  }

  class Card {
    + number: string
    + limit: number
  }

  class News {
    + icon: string
    + description: string
  }

  Pessoa --> Account : has
  Pessoa --> Feature : has many
  Pessoa --> Card : has
  Pessoa --> News : has many
```
