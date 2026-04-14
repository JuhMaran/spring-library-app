# Spring Library App

## Arquitetura da Aplicação

| Camada         | Responsabilidade            |
|----------------|-----------------------------|
| **Entity**     | Representa tabelas do banco |
| **Repository** | Acesso a dados (JPA)        |
| **Service**    | Regras de negócio           |
| **Controller** | Entrada HTTP (MVC)          |
| **View**       | Interface com Thymeleaf     |

## Estrutura de Pacotes

```text
com.juhmaran.library
├── bootstrap
├── controller
├── domain
├── repository
├── service
│    ├── impl
└── SpringLibraryAppApplication
```

## Acessos

- http://localhost:8080/books
- http://localhost:8080/authors
- http://localhost:8080/publishers
- http://localhost:8080/h2-console
