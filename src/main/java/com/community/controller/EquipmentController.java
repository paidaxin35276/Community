package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.EquipmentEntityMapper;
import com.community.entity.EquipmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

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
        System.out.println(111111111);
        String name = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
        String status = new String(request.getParameter("status").getBytes("iso-8859-1"),"utf-8");
        String describe = new String(request.getParameter("describe").getBytes("iso-8859-1"),"utf-8");
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String createTime = formatter.format(new Date());
        String isdelete = new String(request.getParameter("isdelete").getBytes("iso-8859-1"),"utf-8");
        if ("是".equals(isdelete)) {
            isdelete = "0";
        } else if ("否".equals(isdelete)) {
            isdelete = "1";
        }
        equipmentEntity = new EquipmentEntity();
        equipmentEntity.setName(name);
        equipmentEntity.setStartus(Integer.parseInt(status));
        equipmentEntity.setDescribe(describe);
        equipmentEntity.setCreate_time(createTime);
        equipmentEntity.setIsdelete(Integer.parseInt(isdelete));
        equipmentEntityMapper.addEquipmentSql1(equipmentEntity);
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
