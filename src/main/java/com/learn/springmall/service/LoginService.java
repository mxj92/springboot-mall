package com.learn.springmall.service;

import com.learn.springmall.dao.ILoginDao;
import com.learn.springmall.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService implements ILoginService{

    @Resource
    private ILoginDao loginDao;

    @Override
    public void insertUser(User user) {
        loginDao.insertUser(user);
    }

    @Override
    public void deleteUser(String name) {
        loginDao.deleteUser(name);
    }

    @Override
    public void updateUser(User user) {
        loginDao.updateUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return loginDao.getUserByName(name);
    }
}
