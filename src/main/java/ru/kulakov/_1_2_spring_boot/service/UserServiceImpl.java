package ru.kulakov._1_2_spring_boot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kulakov._1_2_spring_boot.dao.UserDao;
import ru.kulakov._1_2_spring_boot.model.User;


import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public void add(String username, Integer age, String city) {
        userDao.add(new User(username, age, city));
    }

    @Override
    public void updateUser(String username, Integer age, String city, Long id) {
        User user = userDao.find(id);
        user.setUsername(username);
        user.setAge(age);
        user.setCity(city);
        userDao.updateUser(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
