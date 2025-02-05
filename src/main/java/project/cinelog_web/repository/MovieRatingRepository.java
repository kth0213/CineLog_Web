package project.cinelog_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cinelog_web.model.MovieRating;

import java.util.List;

public interface MovieRatingRepository extends JpaRepository<MovieRating, Long> {
    MovieRating findByMovieIdAndUserId(long movieId, long userId);

    List<MovieRating> findByMovieId(long movieId);

    List<MovieRating> findByUserId(long userId);

}
