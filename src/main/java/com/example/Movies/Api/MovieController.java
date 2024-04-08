package com.example.Movies.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // The @RestController annotation is a part of Spring MVC, a module of the Spring Framework. It is used at the class level to indicate that the class should be treated as a controller where every method returns a domain object instead of a view.  In the context of your MovieController class, the @RestController annotation indicates that this class is a RESTful controller. All handler methods in this class will have their return values written directly to the body of the HTTP response, rather than being interpreted as view names.
@RequestMapping("/api/v1/movies") //The @RequestMapping annotation is a part of Spring MVC, a module of the Spring Framework. It is used at the class level or method level to map web requests onto specific handler classes or handler methods.  At the class level, @RequestMapping is used to provide a base URI for the controller. All methods in the controller will then be relative to this base URI.  At the method level, @RequestMapping is used to map a specific HTTP request method and URI to a handler method.
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping //The @GetMapping annotation is a part of Spring MVC, a module of the Spring Framework. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).  @GetMapping is used at the method level to map HTTP GET requests onto specific handler methods. The URI value for @GetMapping is relative to the class-level URI specified by @RequestMapping on the controller class.  In the context of your MovieController class, the @GetMapping annotation is used to map HTTP GET requests to the allMovies() method. When a GET request is made to "/api/v1/movies", the allMovies() method is invoked and its return value ("All Movies!") is written directly to the body of the HTTP response.
    //ResponseEntity is a class in Spring Framework that represents the entire HTTP response: status code, headers, and body. It allows you to fully configure the HTTP response. You can use it in your controller methods in the @RestController annotated classes.  In the context of your MovieController class, ResponseEntity<String> is used as the return type of the allMovies() method. This means that the allMovies() method will return an HTTP response with a body of type String
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
}
