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

## Objetos da minha aplicação no formato JSON:

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

- @Entity
- @Id
- @GeneratedValue(strategy = GenerationType.IDENTITY)
- @OneToOne(cascade = CascadeType.ALL)
- @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
- @Column(unique = true)
- @Column(name = "additional_limit", scale = 2, precision = 13)
- @MappedSuperclass
- @Getter
- @Setter
- @Service
- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @PathVariable
- @RestControllerAdvice
- @ExceptionHandler

<br>

## 👨‍🎓 Autor

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
