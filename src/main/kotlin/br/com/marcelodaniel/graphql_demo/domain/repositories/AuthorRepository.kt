package br.com.marcelodaniel.graphql_demo.domain.repositories

import br.com.marcelodaniel.graphql_demo.domain.model.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AuthorRepository : JpaRepository<Author, Long> {
    fun findByEmail(email: String): Optional<Author>
}