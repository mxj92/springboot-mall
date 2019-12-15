package com.learn.springmall.controller;

import com.learn.springmall.pojo.User;
import com.learn.springmall.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Resource
    private ILoginService loginService;

    @GetMapping("/login")
    public String login(HttpServletRequest request) {

        String name = (String) request.getSession().getAttribute("name");
        String password = (String) request.getSession().getAttribute("password");
        User user = loginService.getUserByName(name);
        if (null != user) {
            if (user.getPassword() == password) {
                return "success";
            }
        }

        return "login";
    }
}
