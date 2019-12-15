package com.learn.springmall.service;

import com.learn.springmall.pojo.User;

public interface ILoginService {
    void insertUser(User user);

    void deleteUser(String name);

    void updateUser(User user);

    User getUserByName(String name);
}
