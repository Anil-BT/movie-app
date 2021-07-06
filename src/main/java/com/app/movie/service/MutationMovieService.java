package com.app.movie.service;

import com.app.movie.entity.Movie;
import com.app.movie.model.MovieInput;

public interface MutationMovieService {
    Movie addMovie(MovieInput input);
}
