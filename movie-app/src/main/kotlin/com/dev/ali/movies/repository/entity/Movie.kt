package com.dev.ali.movies.repository.entity

import org.springframework.beans.factory.annotation.Value
import javax.persistence.*

@Entity
@Table(name = "movie")
data class Movie(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val title: String,
        val poster: String,
        val imdbRating: Float,
)