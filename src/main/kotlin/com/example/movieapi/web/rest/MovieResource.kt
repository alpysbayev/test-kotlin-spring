package com.example.movieapi.web.rest

import com.example.movieapi.dto.MovieDTO
import com.example.movieapi.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception
import java.lang.IllegalArgumentException

@RestController
class MovieResource(
    private val movieService: MovieService
) {
    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO?> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }
}