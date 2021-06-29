package br.com.marcelodaniel.graphql_demo.domain.services

import br.com.marcelodaniel.graphql_demo.domain.model.Author
import br.com.marcelodaniel.graphql_demo.domain.repositories.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthorService {

    @Autowired
    private lateinit var authorRepository: AuthorRepository

    fun create(author: Author): Author = authorRepository.save(author)

    fun findAuthorByEmail(email: String) = authorRepository.findByEmail(email)

}