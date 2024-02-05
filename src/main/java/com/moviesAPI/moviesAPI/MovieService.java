package com.moviesAPI.moviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired //dependency injection
    private MovieRepository movieRepository;

    public List<Movies> getAllMovies() {
       return movieRepository.findAll();
    }
}
