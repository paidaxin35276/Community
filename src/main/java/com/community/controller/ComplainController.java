package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.ComplainEntityMapper;
import com.community.entity.ComplainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ComplainController {

    @Autowired
    private ComplainEntityMapper complainEntityMapper;

    //数据绑定
    @RequestMapping("getComplain")
    public void getComplain(HttpServletResponse response) throws IOException {
        List<ComplainEntity> complainEntities = complainEntityMapper.queryComplain();
        response.setCharacterEncoding("UTF-8");
        String dateJson = JSON.toJSONString(complainEntities);
        response.getWriter().write(dateJson);
    }

    //增加数据
    @RequestMapping("addComplain")
    public void addComplain(ComplainEntity complainEntity, HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("utf-8");
        String content = request.getParameter("content");
        String status = request.getParameter("status");
        if ("创建、待指派".equals(status)){
            status = "1";
        } else if ("已指派、待处理".equals(status)){
            status = "2";
        } else if ("已处理、待反馈".equals(status)){
            status = "3";
        } else if ("已完成".equals(status)){
            status = "4";
        }else if ("反馈未完成、重新指派".equals(status)){
            status = "5";
        }
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String create_Time = formatter.format(new Date());
        complainEntity.setContent(content);
        complainEntity.setCreate_time(create_Time);
        complainEntity.setStatus(Integer.parseInt(status));
        complainEntityMapper.addComplain(complainEntity);
        System.out.println(complainEntity);
        response.getWriter().write("{\"success\":\"success\"}");
    }

    //增加数据
    @RequestMapping("updateComplain")
    public void updateComplain(ComplainEntity complainEntity, HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("utf-8");
        String content = request.getParameter("content");
        String status = request.getParameter("status");
        if ("创建、待指派".equals(status)){
            status = "1";
        } else if ("已指派、待处理".equals(status)){
            status = "2";
        } else if ("已处理、待反馈".equals(status)){
            status = "3";
        } else if ("已完成".equals(status)){
            status = "4";
        }else if ("反馈未完成、重新指派".equals(status)){
            status = "5";
        }
        complainEntity.setStatus(Integer.parseInt(status));
        complainEntity.setContent(content);
        complainEntityMapper.addComplain(complainEntity);
        System.out.println(complainEntity);
        response.getWriter().write("{\"success\":\"success\"}");
    }

    @RequestMapping("delComplain")
    public void delComplain(HttpServletResponse response,HttpServletRequest request) throws Exception{;
        request.setCharacterEncoding("utf-8");
        String eid=request.getParameter("id");
        int id=Integer.parseInt(new String(eid.getBytes("ISO-8859-1"),"UTF-8"));
        complainEntityMapper.delComplain(id);
        response.getWriter().write("{\"success\":\"success\"}");
    }

}
