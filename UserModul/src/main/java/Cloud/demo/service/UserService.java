package Cloud.demo.service;

import Cloud.demo.model.User;
import Cloud.demo.repository.UserReposirory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserReposirory userReposirory;

    public UserService(UserReposirory userReposirory) {
        this.userReposirory = userReposirory;
    }

    public Optional<User> getById(int userId) {
        return userReposirory.getById(userId);
    }
}
