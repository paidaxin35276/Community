package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.MenuEntityMapper;
import com.community.entity.MeunEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "meun")
public class MeunController {
    @Autowired
    public MenuEntityMapper menuEntityMapper;

    private HttpServletRequest request;
    private HttpServletResponse response;




    @RequestMapping(value = "getMeun")
    public void getMeun(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.request = request;
        this.response = response;
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        List<MeunEntity> list = menuEntityMapper.getOne();
        for (MeunEntity meunEntity : list) {
            List<MeunEntity> list1 = menuEntityMapper.getTwo(meunEntity.getId());
            meunEntity.setList(list1);
        }
        String str = JSON.toJSONString(list);
        //因为一旦主菜单中没有子菜单 那么json传过去的数据就有个字段是 list:[]
        //为了避免给前台造成不必要的麻烦 在后台直接把这个list:[]给过滤掉！！！！！
        //String jsonString = str.toString().replace(",\"list\":[]", "");
        response.getWriter().write(str);
    }

}
