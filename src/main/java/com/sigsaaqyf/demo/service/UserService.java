package com.sigsaaqyf.demo.service;

import com.sigsaaqyf.demo.entity.User;

public interface UserService {

    public Iterable<User> getAllUsers();
    public Iterable<User> getAllActiveUsers();
    public User createUser(User user) throws Exception;
    public User getUserById(Long id) throws Exception;
    public User updateUser(User user) throws Exception;
    public void deleteUser(Long id) throws Exception;
}