package com.dev.ali.movies.controller

import com.dev.ali.movies.controller.response.CreateMovieResponse
import com.dev.ali.movies.service.MovieService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/apiV2")
class MovieController(val service: MovieService) {

    @GetMapping("/top10")
    fun getBooks(): ResponseEntity<List<CreateMovieResponse>> {
        println("checkpoint spring app")
        return ResponseEntity.ok(service.getTop10())
    }
}