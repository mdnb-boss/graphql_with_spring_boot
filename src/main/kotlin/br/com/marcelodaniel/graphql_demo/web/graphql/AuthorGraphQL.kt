package br.com.marcelodaniel.graphql_demo.web.graphql

import br.com.marcelodaniel.graphql_demo.domain.model.Author
import br.com.marcelodaniel.graphql_demo.domain.services.AuthorService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AuthorGraphQL : GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private lateinit var authorService: AuthorService

    fun findAuthor(email: String) = authorService.findAuthorByEmail(email)

    fun createAuthor(author: Author) = authorService.create(author)

}