package com.app.movie.service;

import com.app.movie.entity.Movie;
import com.app.movie.model.MovieInput;
import com.app.movie.repository.MovieRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MutationMovieServiceImpl implements MutationMovieService, GraphQLMutationResolver {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie addMovie(MovieInput input) {
        Movie movie = new Movie();
        movie.setId(new Random().nextLong());
        movie.setTitle(input.getTitle());
        movie.setTagline(input.getTagline());
        movie.setReleased(input.getReleased());
        return movieRepository.save(movie);
    }
}
