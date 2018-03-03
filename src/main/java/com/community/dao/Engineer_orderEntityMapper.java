package com.community.dao;

import com.community.entity.Engineer_orderEntity;

public interface Engineer_orderEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Engineer_orderEntity record);

    int insertSelective(Engineer_orderEntity record);

    Engineer_orderEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Engineer_orderEntity record);

    int updateByPrimaryKey(Engineer_orderEntity record);
}