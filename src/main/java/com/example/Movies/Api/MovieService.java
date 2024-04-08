package com.example.Movies.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository MovieRepo;
    public List<Movie> allMovies(){
        return MovieRepo.findAll();
    }
}
