package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.model.Movie;
import project.cinelog_web.model.MovieRating;
import project.cinelog_web.model.User;
import project.cinelog_web.repository.MovieRatingRepository;

import java.time.LocalDate;

@Service
public class MovieRatingService {

    private final MovieRatingRepository movieRatingRepository;

    public MovieRatingService(MovieRatingRepository movieRatingRepository) {
        this.movieRatingRepository = movieRatingRepository;
    }

    public void create(Movie movie,Integer rating, User user, String comment) {
        MovieRating m = new MovieRating();
        m.setMovie(movie);
        m.setRating(rating);
        m.setUser(user);
        m.setComment(comment);
        m.setCreateAt(LocalDate.now());
        this.movieRatingRepository.save(m);
    }

    public void delete(MovieRating movieRating) {
        this.movieRatingRepository.delete(movieRating);
    }

}
