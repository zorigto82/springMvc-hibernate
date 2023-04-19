package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getlistUsers();

    void add(User user);

    void update(User user);

    void delete(long id);

    void showId(long id);
}
