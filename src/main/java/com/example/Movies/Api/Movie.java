package com.example.Movies.Api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId; //
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")  //The @Document annotation is a part of Spring Data MongoDB, a module of Spring Framework. It is used at the class level to indicate that instances of this class will be stored in a MongoDB collection.
@Data // Annotation from Lombok which takes care of all of the getters, setters and toString Methods
@AllArgsConstructor //It generates the constructor for with arguments for all the fields in the class
@NoArgsConstructor // used to automatically generate a no-argument constructor.

public class Movie {
    @Id //Defines Id as the primary key of an entity in context of movie class
    private ObjectId _id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    private List<Review> reviewIds;
}
