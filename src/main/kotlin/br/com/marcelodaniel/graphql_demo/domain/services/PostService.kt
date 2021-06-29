package br.com.marcelodaniel.graphql_demo.domain.services

import br.com.marcelodaniel.graphql_demo.domain.model.Post
import br.com.marcelodaniel.graphql_demo.domain.repositories.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService {

    @Autowired
    private lateinit var postRepository: PostRepository

    @Autowired
    private lateinit var authorService: AuthorService

    fun create(post: Post, email: String): Post {
        post.author = authorService.findAuthorByEmail(email).get()
        return postRepository.save(post)
    }

    fun findPost(id: Long) = postRepository.findById(id)

}