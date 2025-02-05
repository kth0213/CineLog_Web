package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.model.User;
import project.cinelog_web.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        this.userRepository.save(user);
    }
}
