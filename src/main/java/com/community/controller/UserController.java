package com.community.controller;

import com.community.dao.UserEntiyMapper;
import com.community.entity.UserEntiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserEntiyMapper userEntiyMapper;
    @RequestMapping("login")
    public String checkLogin(String username, String upassword) {

        System.out.println(username+"__"+upassword);

        return "index";
    }
}
