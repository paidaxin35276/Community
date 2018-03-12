package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.EquipmentStartusMapper;
import com.community.entity.EquipmentStartusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class EquipmentStartusController {

    @Autowired
    private EquipmentStartusMapper equipmentStartusMapper;

    @RequestMapping("getEquipmentStartus")
    public void getEquipmentStartus(HttpServletResponse response) throws IOException {
        List<EquipmentStartusEntity> equipmentStartusEntities = equipmentStartusMapper.getEquipmentStartus();
        response.setCharacterEncoding("UTF-8");
        String dateJson = JSON.toJSONString(equipmentStartusEntities);
        response.getWriter().write(dateJson);
    }

}
