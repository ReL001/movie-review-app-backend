package com.example.Movies.Api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId; //
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
    @DocumentReference        // The @DocumentReference annotation is a part of Spring Data MongoDB, a module of Spring Framework. It is used to create a reference from one document to another in MongoDB.  In the context of your Movie class, the @DocumentReference annotation is used on the List<Review> reviewIds; field. This means that each Movie document in the MongoDB database will contain a list of references to Review documents. These references are typically stored as the _id of the Review documents.
    private List<Review> reviewIds;
}
