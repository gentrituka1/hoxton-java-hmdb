package com.actors.hoxtonjavaimdb;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Movie {
 public static ArrayList<Movie> movies = new ArrayList<>();

  public Integer id;
  public String title;
  public String description;
  public Integer year;


  static {
    new Movie(1, "The Godfather", "The corruption-soaked story follows a powerful immigrant family grappling with the paradoxical values of reign and religion; those moral contradictions are crystallized in a legendary baptism sequence, superbly edited in parallel to the murdering of four rivaling dons.", 1972);
    new Movie(2, "Goodfellas", "Ray Liotta’s opening line is the crime movie equivalent of ‘Once upon a time…’, and what follows is Martin Scorsese’s version of a fairy tale – the story of a starry-eyed Brooklyn kid who realises his boyhood dream and still comes out a schnook in the end.", 1990);
    new Movie(3, "The Dark Knight", "There’s a new Batman in Gotham, in the shadowy form of Matt Reeves’s The Batman – and this is the bar it has to clear.", 2008);
  }

  public Movie(Integer id, String title, String description, Integer year) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.year = year;

    Movie.movies.add(this);
  }
}