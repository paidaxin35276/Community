package com.community.dao;

import com.community.entity.Work_logEntity;

public interface Work_logEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Work_logEntity record);

    int insertSelective(Work_logEntity record);

    Work_logEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work_logEntity record);

    int updateByPrimaryKey(Work_logEntity record);
}