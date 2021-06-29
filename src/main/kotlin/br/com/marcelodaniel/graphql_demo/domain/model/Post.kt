package br.com.marcelodaniel.graphql_demo.domain.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.ManyToOne
import javax.persistence.JoinColumn

@Entity
@Table(name = "posts")
open class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,

    open var title: String? = null,

    open var description: String? = null,

    open var content: String? = null,

    @ManyToOne
    @JoinColumn
    open var author: Author? = null
)
