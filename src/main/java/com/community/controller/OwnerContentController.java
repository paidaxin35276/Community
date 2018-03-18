package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.Owner_eventEntityMapper;
import com.community.entity.Owner_eventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class OwnerContentController {
    @Autowired
    private Owner_eventEntityMapper owner_eventEntityMapper;
    @RequestMapping("selectownerevent")
    public void selectownerevent(HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println("进来了");

        List<Owner_eventEntity> owner_eventEntities = owner_eventEntityMapper.owner_event();
        response.setCharacterEncoding("utf-8");
        response.setContentType("index/html");
        String jsondate = JSON.toJSONString(owner_eventEntities);

        System.out.println(jsondate);

        response.getWriter().write(jsondate);

        System.out.println("出去了");
    }

    @RequestMapping("deletes")
    public void deleteownerevent(HttpServletResponse response,HttpServletRequest request) throws Exception {
        response.setCharacterEncoding("utf-8");
        String oid=request.getParameter("id");
        System.out.println(oid);
        int id=Integer.parseInt(new String(oid.getBytes("ISO-8859-1"),"utf-8"));
        owner_eventEntityMapper.DeleteByIds(id);
        response.getWriter().write("{\"success\":\"success\"}");



    }

}
