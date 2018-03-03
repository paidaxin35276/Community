package com.community.dao;

import com.community.entity.Urgent_eventEntity;

public interface Urgent_eventEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Urgent_eventEntity record);

    int insertSelective(Urgent_eventEntity record);

    Urgent_eventEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Urgent_eventEntity record);

    int updateByPrimaryKey(Urgent_eventEntity record);
}