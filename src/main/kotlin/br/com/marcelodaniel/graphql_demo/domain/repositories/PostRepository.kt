package br.com.marcelodaniel.graphql_demo.domain.repositories

import br.com.marcelodaniel.graphql_demo.domain.model.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long>