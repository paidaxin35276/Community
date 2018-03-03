package com.community.dao;

import com.community.entity.Urgent_event_logEntity;

public interface Urgent_event_logEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Urgent_event_logEntity record);

    int insertSelective(Urgent_event_logEntity record);

    Urgent_event_logEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Urgent_event_logEntity record);

    int updateByPrimaryKey(Urgent_event_logEntity record);
}