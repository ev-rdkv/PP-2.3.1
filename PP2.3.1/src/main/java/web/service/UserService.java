package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

}