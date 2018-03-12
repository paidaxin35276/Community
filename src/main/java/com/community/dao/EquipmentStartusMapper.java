package com.community.dao;

import com.community.entity.EquipmentStartusEntity;
import com.community.util.EquipmentStartusBuilUtil;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface EquipmentStartusMapper {

    //数据绑定
    @SelectProvider(type= EquipmentStartusBuilUtil.class,method = "queryEquipmentStartus")
    List<EquipmentStartusEntity> getEquipmentStartus();

}
