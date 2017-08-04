package com.allstate.compozed.controller;

import com.allstate.compozed.model.Movie_API_Model;
import com.allstate.compozed.repository.Movie_API_Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/movies")

public class Movie_API_Controller {
    public final Movie_API_Repository repository;

public Movie_API_Controller(Movie_API_Repository repository) {
    this.repository = repository;
}

@GetMapping("")
    public Iterable <Movie_API_Model> allMovies() {
    return this.repository.findAll();
}

@PostMapping("")
    public Movie_API_Model create(@RequestBody Movie_API_Model movie){
    return this.repository.save(movie);
}



}



