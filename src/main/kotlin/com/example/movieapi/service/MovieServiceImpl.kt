package com.example.movieapi.service

import com.example.movieapi.dto.MovieDTO
import com.example.movieapi.repository.MovieRepository
import com.example.movieapi.utils.mapper.MovieMapper
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper

) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {

        if(movieDTO.id != null)
            throw IllegalArgumentException("Id must be null or -1.")

        val movie = movieMapper.toEntity(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}