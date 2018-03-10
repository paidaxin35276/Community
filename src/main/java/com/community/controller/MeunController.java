package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.MenuEntityMapper;
import com.community.entity.MeunEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "meun")
public class MeunController {
    @Autowired
    public MenuEntityMapper menuEntityMapper;

    @RequestMapping(value = "getMeun")
    public void getMeun(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("菜单查询——进来了");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        List<MeunEntity> list = menuEntityMapper.getTwo(1);
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
        System.out.println("菜单查询——出去了");
        request.setAttribute("JsonStr",jsonString);
        response.getWriter().print(jsonString);
    }
}
