package ru.kulakov._1_2_spring_boot.dao;



import ru.kulakov._1_2_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();

    void add(User user);

    User find(Long id);

    void updateUser(User user);

    void delete(Long id);
}
