[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Santander-Dev-Week/blob/main/LICENSE)

# Santander Dev Week - APIs com Java 17 e Spring Boot 3

<br>

## Start do projeto base:

- https://start.spring.io/

<br>

## Dependências:

- Spring Web
- Spring Data JPA
- H2 Database
- PostgreSQL Driver
- Lombok

<br>

## Objetos da aplicação no formato JSON:

```
{
	"name": "Lucas",
	"account": {
		"number": "00000000-0",
		"agency": "0000",
		"balance": 1234.56,
		"limit": 1000.00
	},
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

<br>

## Gerando diagrama de classe Mermaid com chatGPT utilizando JSON:

```mermaid
classDiagram
  class User {
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

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

<br>

## Anotações:

- [@Entity](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Id](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@GeneratedValue(strategy = GenerationType.IDENTITY)](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@OneToOne(cascade = CascadeType.ALL)](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Column(unique = true)](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Column(name = "additional_limit", scale = 2, precision = 13)](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@MappedSuperclass](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Getter](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Setter](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@Service](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@RestController](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@RequestMapping](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@GetMapping](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@PostMapping](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@PathVariable](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@RestControllerAdvice](https://github.com/lucarauj/Anotacoes-Spring-Framework)
- [@ExceptionHandler](https://github.com/lucarauj/Anotacoes-Spring-Framework)

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
