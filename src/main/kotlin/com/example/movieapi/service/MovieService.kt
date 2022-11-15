package com.example.movieapi.service

import com.example.movieapi.dto.MovieDTO

interface MovieService {

    fun createMovie(movieDTO: MovieDTO): MovieDTO
}