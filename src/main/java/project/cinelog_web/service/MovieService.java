package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


}
