package com.community.dao;

import com.community.entity.BuildingEntity;

public interface BuildingEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BuildingEntity record);

    int insertSelective(BuildingEntity record);

    BuildingEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BuildingEntity record);

    int updateByPrimaryKey(BuildingEntity record);
}