package project.cinelog_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cinelog_web.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String keyword);
    Movie findById(long id);
}
