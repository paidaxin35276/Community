package com.community.controller;

import com.alibaba.fastjson.JSON;
import com.community.dao.EquipmentEntityMapper;
import com.community.entity.EquipmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EquipmentController {

    @Autowired
    private EquipmentEntityMapper equipmentEntityMapper;

    @RequestMapping("getEquipment")
    public void getEquipment(HttpServletResponse response) throws IOException {
        System.out.println("BEGIN");
        List<EquipmentEntity> equipmentEntities = equipmentEntityMapper.queryForNameByID1();
        for (EquipmentEntity equipmentEntity : equipmentEntities) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            System.out.println(equipmentEntity.getCreateTime());
        }
        response.setCharacterEncoding("UTF-8");
        String str = JSON.toJSONString(equipmentEntities);
        System.out.println(str);
        response.getWriter().write(str);
    }
}
