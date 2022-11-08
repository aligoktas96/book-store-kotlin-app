package com.dev.ali.bookstore.service

import com.dev.ali.bookstore.controller.request.CreateBookRequest
import com.dev.ali.bookstore.converter.toBook
import com.dev.ali.bookstore.repository.BookRepository
import com.dev.ali.bookstore.repository.entity.Book
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

    fun getAllBooks(): List<Book> = bookRepository.findAll()

    fun getBookByTitle(title: String): Book = bookRepository
            .findByTitle(title)
            .orElseThrow { NotFoundException() }

    fun getBookByAuthor(author: String): Book = bookRepository.findByAuthor(author)
            .orElseThrow { NotFoundException() }

    fun createBook(createBookRequest: CreateBookRequest): Book {
        return bookRepository.save(createBookRequest.toBook())
    }

}