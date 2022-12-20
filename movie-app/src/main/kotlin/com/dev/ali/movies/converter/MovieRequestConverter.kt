package com.dev.ali.movies.converter

import com.dev.ali.movies.repository.entity.Movie
import com.dev.ali.movies.controller.response.CreateMovieResponse
import java.util.stream.Collectors
import java.util.stream.Stream


fun Movie.toResponse(): CreateMovieResponse = CreateMovieResponse(
    title = this.title,
    poster = this.poster,
    imdbRating = this.imdbRating
)

fun <T : Any> Stream<T>.toList(): List<T> = this.collect(Collectors.toList<T>())