package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.model.Movie;
import project.cinelog_web.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Movie not found"));
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }



}
