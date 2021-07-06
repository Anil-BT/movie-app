package com.app.movie.model;

import lombok.Data;

@Data
public class MovieInput {
    private String title;
    private int released;
    private String tagline;
}
