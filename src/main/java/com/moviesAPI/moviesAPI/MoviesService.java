package com.moviesAPI.moviesAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    @Autowired //dependency injection
    private MoviesRepository moviesRepository;

    public List<Movies> getAllMovies() {
       return moviesRepository.findAll();
    }

    public Optional<Movies> getOneMovie(String id) { return moviesRepository.findMoviesByImdbId(id);}
}
