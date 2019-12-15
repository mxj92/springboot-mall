package com.learn.springmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthorizeController {

    //@RequestParam("code") String code, @RequestParam("state") String state,
    @GetMapping("/login")
    public String login(HttpServletRequest request) {

        Object user = new Object();//todo
        if (null != user) {
            request.getSession().setAttribute("user", user);
            return "redirect:index";
        } else {
            return "redirect:index";
        }
    }
}
