package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.VisitorEntityMapper;
import com.community.entity.VisitorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class VisitorController {
    @Autowired
    private VisitorEntityMapper visitorEntityMapper;
    @RequestMapping("byselect")
    public void GetList(HttpServletResponse response)throws IOException{
        response.setCharacterEncoding("utf-8");
        response.setContentType("index/html");
        List<VisitorEntity> visitor = visitorEntityMapper.visitor();
        String josn= JSON.toJSONString(visitor);
        System.out.println(josn);
        response.getWriter().write(josn);

    }
    @RequestMapping("del")
    public void DeleteById(HttpServletResponse response, HttpServletRequest request)throws IOException{
        response.setCharacterEncoding("utf-8");
        String cid=request.getParameter("id");
        System.out.println(cid);
         int sid = Integer.parseInt(new String(cid.getBytes("ISO-8859-1"),"UTF-8"));
        visitorEntityMapper.deletebyid(sid);
        response.getWriter().write("{\"success\":\"success\"}");
    }
}
