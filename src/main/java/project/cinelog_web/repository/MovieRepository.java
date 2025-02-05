package project.cinelog_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cinelog_web.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByName(String name);
    Movie findById(long id);
}
