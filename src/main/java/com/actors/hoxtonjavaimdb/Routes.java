package com.actors.hoxtonjavaimdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
    @GetMapping("/actors/{id}")
    public Actor getSingleActor(@PathVariable Integer id) {
        Actor match = null;

        for (Actor actor : Actor.actors) {
            if (actor.id == id) {
                match = actor;
            }
        }
        if(match == null) {
            throw new Error("Actor not found");
        }

        return match;
    }

    @PostMapping("/actors")

    public Actor createActor(@RequestBody Actor actor) {
        // create a new actor and include his/her movies
        Actor.actors.add(actor);
        return actor;
    }
    
    @GetMapping("/movies/{id}")

    //Get a movie with all its actors

    public Movie getSingleMovie(@PathVariable Integer id) {
        Movie match = null;

        for (Movie movie : Movie.movies) {
            if (movie.id == id) {
                match = movie;
            }
        }
        if(match == null) {
            throw new Error("Movie not found");
        }

        return match;
    }

    @PostMapping("/movies")

    public Movie createMovie(@RequestBody Movie movie) {
        // create a new movie
        // Think of a way to auto-increment a new id each time we create a new movie or actor
        
        Movie.movies.add(movie);
        return movie;
    }
}
