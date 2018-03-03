package com.community.dao;

import com.community.entity.EquipmentEntity;

public interface EquipmentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentEntity record);

    int insertSelective(EquipmentEntity record);

    EquipmentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquipmentEntity record);

    int updateByPrimaryKey(EquipmentEntity record);
}