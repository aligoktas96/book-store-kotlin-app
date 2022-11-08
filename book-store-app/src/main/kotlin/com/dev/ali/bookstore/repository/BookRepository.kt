package com.dev.ali.bookstore.repository

import com.dev.ali.bookstore.repository.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookRepository : JpaRepository<Book, Long> {

    fun findByAuthor(author: String): Optional<Book>

    fun findByTitle(title: String): Optional<Book>

}