package com.dev.ali.bookstore.controller

import com.dev.ali.bookstore.controller.request.CreateBookRequest
import com.dev.ali.bookstore.controller.response.CreateBookResponse
import com.dev.ali.bookstore.converter.toResponse
import com.dev.ali.bookstore.service.BookService
import org.jetbrains.annotations.NotNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class TransferController(val service: BookService) {

    @PostMapping("/new")
    fun newBook(@RequestBody createBookRequest: CreateBookRequest): ResponseEntity<CreateBookResponse> {
        return ResponseEntity.ok(service.createBook(createBookRequest).toResponse())
    }

    @GetMapping("/{title}")
    fun getBook(@PathVariable("title") @NotNull title: String): ResponseEntity<CreateBookResponse> {
        return ResponseEntity.ok(service.getBookByTitle(title).toResponse())

    }
}