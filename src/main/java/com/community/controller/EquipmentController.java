package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.EquipmentEntityMapper;
import com.community.entity.EquipmentEntity;
import com.community.entity.UserEntiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EquipmentController {

    @Autowired
    private EquipmentEntityMapper equipmentEntityMapper;

    //数据绑定
    @RequestMapping("getEquipment")
    public void getEquipment(HttpServletResponse response) throws IOException {
        List<EquipmentEntity> equipmentEntities = equipmentEntityMapper.queryForNameByID1();
        response.setCharacterEncoding("UTF-8");
        String dateJson = JSON.toJSONString(equipmentEntities);
        response.getWriter().write(dateJson);
    }

    //增加数据
    @RequestMapping("addEquipment")
    public void addEquipment(EquipmentEntity equipmentEntity, HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("utf-8");
        String ename = request.getParameter("ename");
        String status = request.getParameter("status");
        if ("使用".equals(status)){
            status = "1";
        } else if ("闲置".equals(status)){
            status = "2";
        } else if ("损坏".equals(status)){
            status = "3";
        } else if ("维修".equals(status)){
            status = "4";
        }
        String edescribe = request.getParameter("edescribe");
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String createTime = formatter.format(new Date());
        equipmentEntity.setCreate_time(createTime);
        equipmentEntity.setStartus(Integer.parseInt(status));
        equipmentEntity.setEname(ename);
        equipmentEntity.setEdescribe(edescribe);
        equipmentEntityMapper.addEquipmentSql1(equipmentEntity);
        System.out.println(equipmentEntity);
        response.getWriter().write("{\"success\":\"success\"}");
    }
//        @RequestMapping
//         @ResponseBody
//        public  String logind(HttpServletRequest request,HttpServletResponse response){
//            UserEntiy user = new UserEntiy();
//            request.setAttribute("user",user.getUsername());
//            String userName = (String) request.getAttribute("user");
//
//            return " ";
//    }

    //修改数据
    @RequestMapping("updateEquipment")
    public void updateEquipment(EquipmentEntity equipmentEntity, HttpServletRequest request,HttpServletResponse response) throws Exception {
        System.out.println("id="+equipmentEntity.getId());
        response.setCharacterEncoding("utf-8");
        String ename = request.getParameter("ename");
        String status = request.getParameter("status");
        System.out.println();
        if ("使用".equals(status)){
            status = "1";
        } else if ("闲置".equals(status)){
            status = "2";
        } else if ("损坏".equals(status)){
            status = "3";
        } else if ("维修".equals(status)){
            status = "4";
        }
        String edescribe = request.getParameter("edescribe");
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String editTime = formatter.format(new Date());
        equipmentEntity.setStartus(Integer.parseInt(status));
        equipmentEntity.setEname(ename);
        equipmentEntity.setEdescribe(edescribe);
        equipmentEntity.setEdit_time(editTime);
        equipmentEntityMapper.updateEquipmentSql1(equipmentEntity);
        System.out.println(equipmentEntity);
        response.getWriter().write("{\"success\":\"success\"}");
    }


    @RequestMapping("delEquipment")
    public void delEquipment(HttpServletResponse response,HttpServletRequest request) throws Exception{;
        request.setCharacterEncoding("utf-8");
        String eid=request.getParameter("id");
        int id=Integer.parseInt(new String(eid.getBytes("ISO-8859-1"),"UTF-8"));
        equipmentEntityMapper.delEquipmentSql1(id);
        response.getWriter().write("{\"success\":\"success\"}");
    }


}
