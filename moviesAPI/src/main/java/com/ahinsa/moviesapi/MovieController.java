package com.ahinsa.moviesapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbid), HttpStatus.OK);
    }

}
