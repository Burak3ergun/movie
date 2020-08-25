package com.deneme.movie.data.repository;

import com.deneme.movie.data.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAllByYear(Integer year);
    Optional<List<Movie>> findAllByYearAndName(Integer year, String name);
    Boolean existsByYear(Integer year);
}
