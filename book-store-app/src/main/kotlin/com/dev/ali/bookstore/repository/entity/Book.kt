package com.dev.ali.bookstore.repository.entity

import javax.persistence.*

@Entity
@Table(name = "book")
data class Book(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val title: String,
        val author: String,
        val category: String,
)