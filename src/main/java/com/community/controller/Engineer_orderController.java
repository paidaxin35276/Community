package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.Engineer_orderEntityMapper;
import com.community.entity.Engineer_orderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class Engineer_orderController {

    @Autowired
    private Engineer_orderEntityMapper engineer_orderEntityMapper;

    //数据绑定
    @RequestMapping("getEngineerOrder")
    public void getEngineerOrder(HttpServletResponse response) throws IOException {
        List<Engineer_orderEntity> engineer_orderEntities = engineer_orderEntityMapper.queryEngineer_order();
        response.setCharacterEncoding("UTF-8");
        String dateJson = JSON.toJSONString(engineer_orderEntities);
        response.getWriter().write(dateJson);
    }

    @RequestMapping("delEngineerOrder")
    public void delEngineerOrder(HttpServletResponse response,HttpServletRequest request) throws Exception{;
        request.setCharacterEncoding("utf-8");
        String eid=request.getParameter("id");
        int id=Integer.parseInt(new String(eid.getBytes("ISO-8859-1"),"UTF-8"));
        engineer_orderEntityMapper.delEngineerOrder(id);
        response.getWriter().write("{\"success\":\"success\"}");
    }

}
