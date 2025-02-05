package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.model.Movie;
import project.cinelog_web.model.MovieRating;
import project.cinelog_web.model.User;
import project.cinelog_web.repository.MovieRatingRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieRatingService {

    private final MovieRatingRepository movieRatingRepository;

    public MovieRatingService(MovieRatingRepository movieRatingRepository) {
        this.movieRatingRepository = movieRatingRepository;
    }

    public void create(Movie movie, int rating, User user, String comment) {
        MovieRating m = new MovieRating();
        m.setMovie(movie);
        m.setRating(rating);
        m.setUser(user);
        m.setComment(comment);
        m.setCreateAt(LocalDate.now());
        m.setUpdateAt(LocalDate.now());
        this.movieRatingRepository.save(m);
    }

    public List<MovieRating> getRatingByMovie(Long movieId) {
        return movieRatingRepository.findByMovieId(movieId);
    }

    public List<MovieRating> getRatingByUser(Long userId) {
        return movieRatingRepository.findByUserId(userId);
    }

    public MovieRating updateRating(Long ratingId, int newRating, String newComment) {
        MovieRating movieRating = this.movieRatingRepository.findById(ratingId)
                .orElseThrow(()->new IllegalArgumentException("MovieRating not found"));

        movieRating.setRating(newRating);
        if(newComment != null) {
            movieRating.setComment(newComment);
        }
        movieRating.setUpdateAt(LocalDate.now());
        return this.movieRatingRepository.save(movieRating);
    }

    public void delete(Long ratingId) {
        MovieRating rating = movieRatingRepository.findById(ratingId)
                .orElseThrow(() -> new IllegalArgumentException("해당 별점이 존재하지 않습니다."));
        movieRatingRepository.delete(rating);
    }
}
