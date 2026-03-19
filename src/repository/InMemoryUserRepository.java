package repository;

import model.Email;
import model.User;
import java.util.*;

public class InMemoryUserRepository implements UserRepository {

    private final Map<Email, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getEmail(), user);
    }

    public Optional<User> findByEmail(Email email) {
        return Optional.ofNullable(users.get(email));
    }
}