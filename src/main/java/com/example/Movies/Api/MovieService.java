package com.example.Movies.Api;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired  //he @Autowired annotation is used in Spring to automatically inject dependencies into your beans. This can be done on fields, constructors, and methods. When you use @Autowired, Spring looks for a bean that matches the property it is annotating, and injects it automatically.  In your code, you have used @Autowired in your MovieService and MovieController classes. In MovieService, it is used to inject an instance of MovieRepository. In MovieController, it is used to inject an instance of MovieService.
    private MovieRepository MovieRepo;
    public List<Movie> allMovies(){
        return MovieRepo.findAll();
    }

    public Optional<Movie> SingleMovie(ObjectId id){
        return MovieRepo.findById(id);
    }

    public Optional<Movie> SingleMoviebyImdbId(String imdbId){
        return MovieRepo.findMovieByImdbId(imdbId);
    }

    public List<Movie> SingleMovieByTitle(String title){
        return MovieRepo.findMovieByTitle(title);
    }

}
