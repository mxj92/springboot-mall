package com.learn.springmall.dao;

import com.learn.springmall.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class LoginDao  implements ILoginDao{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "insert into tb_user(name, age, gender) values(?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getGender());
    }

    @Override
    public void deleteUser(String name) {
        String sql = "delete from tb_user where name = ?";
        jdbcTemplate.update(sql, name);
    }

    @Override
    public void updateUser(User user) {
        String sql = "update tb_user set age = ?, gender = ? where name = ?";
        jdbcTemplate.update(sql, user.getAge(), user.getGender(), user.getName());
    }

    @Override
    public User getUserByName(String name) {
        String sql = "select * from tb_user where name = ?";
        return jdbcTemplate.queryForObject(sql, User.class);
    }


}
