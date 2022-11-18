package com.dev.ali.bookstore.controller.request

data class CreateBookRequest(val title: String,
                             val author: String,
                             val category: String)