📚 API REST para Gerenciamento de Cursos
Este projeto é uma aplicação Java desenvolvida com Spring Boot, que disponibiliza uma API RESTful para o gerenciamento de cursos. Ele permite realizar operações básicas de CRUD (Create, Read, Update, Delete) sobre os dados de cursos, utilizando boas práticas de desenvolvimento backend.

🚀 Funcionalidades
✅ Criar cursos (POST /cursos)

🔍 Listar todos os cursos (GET /cursos)

📄 Buscar curso por ID (GET /cursos/{id})

✏️ Atualizar curso por ID (PUT /cursos/{id})

❌ Excluir curso por ID (DELETE /cursos/{id})

🛠️ Tecnologias utilizadas
Java 17+

Spring Boot

Spring Web

Spring Data JPA

Bean Validation (JSR-380)

Banco de dados MySQL (ou H2 para testes)

Maven

🧪 Como testar
Você pode usar o Postman ou qualquer outra ferramenta de requisição HTTP para testar os endpoints da API. O projeto utiliza JSON como formato de entrada e saída.

📂 Estrutura
Curso: entidade principal

CursoDto: objeto de transferência de dados (DTO)

CursoRepository: interface de persistência com JPA

CursoService: camada de regras de negócio

CursoResource: camada REST Controller

CursoMapper: conversão entre DTO e entidade

📌 Objetivo
Este projeto tem fins educativos e serve como base para quem está aprendendo desenvolvimento backend com Java e Spring Boot. Ideal para treinar a construção de APIs REST com validação, persistência de dados e boas práticas.
