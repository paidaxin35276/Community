package com.community.dao;

import com.community.entity.Parking_spaceEntity;

public interface Parking_spaceEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parking_spaceEntity record);

    int insertSelective(Parking_spaceEntity record);

    Parking_spaceEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parking_spaceEntity record);

    int updateByPrimaryKey(Parking_spaceEntity record);
}