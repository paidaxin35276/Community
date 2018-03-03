package com.community.dao;

import com.community.entity.Owner_eventEntity;

public interface Owner_eventEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Owner_eventEntity record);

    int insertSelective(Owner_eventEntity record);

    Owner_eventEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Owner_eventEntity record);

    int updateByPrimaryKey(Owner_eventEntity record);
}