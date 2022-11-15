package com.example.movieapi.utils.mapper

import com.example.movieapi.dto.MovieDTO
import com.example.movieapi.entity.Movie

class MovieMapper: Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )

}