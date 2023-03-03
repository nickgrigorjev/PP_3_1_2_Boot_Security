package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User show(int id);
    void create(User user);
    void update(User user);
    void delete(int id);

}
