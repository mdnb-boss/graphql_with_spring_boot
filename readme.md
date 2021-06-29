## Teste de serviço

- ### Graphql Client - GraphQL Playground
    - Download: https://github.com/graphql/graphql-playground
    - Url Serve: http://localhost:8080/graphql

- ### Querys 
   - **FindPost**: Procura um Post pelo ID
   
    **Query Vars**
    ~~~json
    {
      "id": 1
    }
    ~~~

    **Body**
    ~~~graphql
    query FindPost($id: Int!) {
      findPost(id: $id) {
        id
        title
        description
        content
        author {
          fullname
        }
      }
    }
    ~~~
    - **FindAuthor**: Procura um Author pelo email
    
    **Query Vars**
    ~~~json
    {
      "email": "marcelo.brasil@zup.com.br"
    }
    ~~~
    **Body**
    ~~~graphql
    query FindAuthor($email: String!) {
        findAuthor(email: $email) {
            fullname
            posts {
                id
                title
                description
            }
        }
    }
    ~~~
  
- ### Mutations
 - **CreateAuthor**: Cria um Author no banco de dados

    **Query Vars**
    ~~~json
    {
      "author": {
        "fullname": "Marcelo Daniel",
        "email": "marcelo.brasil@zup.com.br"
      }
    }
    ~~~
    **Body**
    ~~~graphql
    mutation CreateAuthor($author: AuthorInput!) {
      createAuthor(author: $author) {
        fullname
        email
      }
    }
    ~~~
   
- **CreatePost**: Cria um Post e atrela a um usuário no banco de dados

  **Query Vars**
    ~~~json
    {
      "email": "marcelo.brasil@zup.com.br",
      "post": {
        "title": "Meu primeiro post",
        "description": "post com graphql",
        "content": "conteudo do meu post"
      }
    }
    ~~~
  **Body**
    ~~~graphql
    mutation CreatePost($post: PostInput!, $email: String!) {
        createPost(post: $post, email: $email) {
            id
            title
            description
            content
            author {
                fullname
                email
            }
        }
    }
    ~~~
        