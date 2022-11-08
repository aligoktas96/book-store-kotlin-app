package com.dev.ali.bookstore.converter

import com.dev.ali.bookstore.controller.request.CreateBookRequest
import com.dev.ali.bookstore.controller.response.CreateBookResponse
import com.dev.ali.bookstore.repository.entity.Book

fun CreateBookRequest.toBook(): Book {
    return Book(
            title = this.title,
            author = this.author,
            category = this.category,
    )
}

fun Book.toResponse(): CreateBookResponse {
    return CreateBookResponse(
            title = this.title,
            author = this.author,
            category = this.category,
    )
}