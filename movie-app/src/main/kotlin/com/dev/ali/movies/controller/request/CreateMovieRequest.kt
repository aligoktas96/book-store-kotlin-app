package com.dev.ali.movies.controller.request

data class CreateMovieRequest(val title: String,
                              val poster: String,
                              val imdbRating: Float)