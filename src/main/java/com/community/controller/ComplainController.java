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

    @RequestMapping("delComplain")
    public void delComplain(HttpServletResponse response,HttpServletRequest request) throws Exception{;
        request.setCharacterEncoding("utf-8");
        String eid=request.getParameter("id");
        int id=Integer.parseInt(new String(eid.getBytes("ISO-8859-1"),"UTF-8"));
        complainEntityMapper.delComplain(id);
        response.getWriter().write("{\"success\":\"success\"}");
    }

}
