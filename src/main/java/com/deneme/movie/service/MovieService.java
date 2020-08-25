package com.deneme.movie.service;

import com.deneme.movie.data.entity.Movie;
import com.deneme.movie.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie insert(Movie movie){
        if(movie.getId() != null){
            movie.setId(null);
        }
        return movieRepository.save(movie);
    }

    public Movie update(Movie movie){
        return movieRepository.save(movie);
    }

    public void delete(Long id){
        movieRepository.deleteById(id);
    }

    public Movie get(Long id){
        return movieRepository.findById(id).get();
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
}
