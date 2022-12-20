package com.dev.ali.movies.service

import com.dev.ali.movies.controller.response.CreateMovieResponse
import com.dev.ali.movies.converter.toResponse
import com.dev.ali.movies.repository.MovieRepository
import org.springframework.stereotype.Service


@Service
class MovieService(private val movieRepository: MovieRepository) {

    fun getTop10(): List<CreateMovieResponse> = movieRepository.findTop10ByOrderByImdbRatingDesc()
        .map { it.toResponse() }.toList()

    // 1. IMPORT DATA in DB
    // 2. Test api
    // 3. Consume requests from angular app

}