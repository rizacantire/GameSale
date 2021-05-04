package abstracts;

import entities.User;

public interface UserService {
    void registry(User user);

    void update(User user);

    void delete(User user);
}
