package br.com.marcelodaniel.graphql_demo.domain.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.OneToMany
import javax.persistence.FetchType
import javax.persistence.CascadeType

@Entity
@Table(name = "authors")
open class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,
    open var fullname: String? = null,
    open var email: String? = null,
    @OneToMany(mappedBy = "author", orphanRemoval = true, fetch = FetchType.EAGER, cascade = [CascadeType.REMOVE])
    open val posts: List<Post> = emptyList()
)