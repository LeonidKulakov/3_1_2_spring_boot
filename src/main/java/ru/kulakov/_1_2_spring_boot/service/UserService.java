package ru.kulakov._1_2_spring_boot.service;


import ru.kulakov._1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void add(String username, Integer age, String city);

    void updateUser(String username, Integer age, String city, Long id);

    void delete(Long id);
}
