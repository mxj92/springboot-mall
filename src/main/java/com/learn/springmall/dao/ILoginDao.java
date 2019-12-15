package com.learn.springmall.dao;

import com.learn.springmall.pojo.User;

public interface ILoginDao {

    void insertUser(User user);

    void deleteUser(String name);

    void updateUser(User user);

    User getUserByName(String name);
}
