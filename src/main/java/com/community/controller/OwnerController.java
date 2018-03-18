package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.OwnerEntityMapper;
import com.community.entity.OwnerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value ="owner")
public class OwnerController {
    @Autowired
    private OwnerEntityMapper ownerEntityMapper;
    @RequestMapping("lists")
    public void SelectAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<OwnerEntity> owner = ownerEntityMapper.GetAlls();
        response.setCharacterEncoding("utf-8");
        response.setContentType("index/html");
        String jos= JSON.toJSONString(owner);
        System.out.println(jos);

        response.getWriter().write(jos);
    }
    @RequestMapping("deletebyId")
    public void DeleteById(HttpServletRequest request,HttpServletResponse response)throws IOException{
        response.setCharacterEncoding("utf-8");
        String cid=request.getParameter("id");
        int id=Integer.parseInt(new String(cid.getBytes("ISO-8859-1"),"UTF-8"));
        ownerEntityMapper.DelById(id);

        response.getWriter().write("{\"success\":\"success\"}");

    }


}
