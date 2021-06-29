package br.com.marcelodaniel.graphql_demo.web.graphql

import br.com.marcelodaniel.graphql_demo.domain.model.Post
import br.com.marcelodaniel.graphql_demo.domain.services.PostService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PostGraphQL : GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private lateinit var postService: PostService

    fun findPost(id: Long) = postService.findPost(id)

    fun createPost(post: Post, email: String) = postService.create(post, email)

}