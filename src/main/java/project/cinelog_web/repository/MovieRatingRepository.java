package project.cinelog_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cinelog_web.model.MovieRating;

public interface MovieRatingRepository extends JpaRepository<MovieRating, Long> {
}
