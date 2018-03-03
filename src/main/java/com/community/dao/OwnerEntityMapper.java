package com.community.dao;

import com.community.entity.OwnerEntity;

public interface OwnerEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OwnerEntity record);

    int insertSelective(OwnerEntity record);

    OwnerEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OwnerEntity record);

    int updateByPrimaryKey(OwnerEntity record);
}