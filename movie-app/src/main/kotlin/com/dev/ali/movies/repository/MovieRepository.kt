package com.dev.ali.movies.repository

import com.dev.ali.movies.repository.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : JpaRepository<Movie, Long> {

    fun findTop10ByOrderByImdbRatingDesc(): List<Movie>

}