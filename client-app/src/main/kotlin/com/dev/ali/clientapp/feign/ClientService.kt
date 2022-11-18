package com.dev.ali.clientapp.feign

import com.dev.ali.bookstore.controller.request.CreateBookRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient("books")
interface ClientService {

    @RequestMapping(method = [RequestMethod.GET], value = ["/books/{title}"], consumes = ["application/json"])
    fun getBook(@PathVariable("title") title: String?): Any?

    @RequestMapping(method = [RequestMethod.POST], value = ["/new"], consumes = ["application/json"])
    fun createBook(@RequestBody createBookRequest: CreateBookRequest): Any?
}