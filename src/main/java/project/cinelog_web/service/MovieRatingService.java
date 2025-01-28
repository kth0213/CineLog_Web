package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.repository.MovieRatingRepository;

@Service
public class MovieRatingService {

    private final MovieRatingRepository movieRatingRepository;

    public MovieRatingService(MovieRatingRepository movieRatingRepository) {
        this.movieRatingRepository = movieRatingRepository;
    }




}
