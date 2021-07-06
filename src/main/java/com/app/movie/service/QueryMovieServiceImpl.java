package com.app.movie.service;

import com.app.movie.entity.Movie;
import com.app.movie.repository.MovieRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryMovieServiceImpl implements QueryMovieService, GraphQLQueryResolver {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
