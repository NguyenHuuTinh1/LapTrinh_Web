package vn.edu.hcmuaf.Service;

import vn.edu.hcmuaf.db.JDBIConnector;
import vn.edu.hcmuaf.model.User;

import java.util.List;
import java.util.stream.Collectors;


public class UserService {
    private static UserService instance;

    private UserService() {

    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User checkLogin(String username, String password) {

        List<User> users = JDBIConnector.get().withHandle(h ->
                h.createQuery("SELECT * FROM users WHERE username = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .stream()
                        .collect(Collectors.toList())
        );
        if (users.size() != 1) return null;
        User user = users.get(0);
        if (!user.getPassword().equals(password)
                || !user.getUsername().equals(username)) return null;
        System.out.println(user);
        return user;
    }
}
