package project.cinelog_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.cinelog_web.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findById(long id);
}
