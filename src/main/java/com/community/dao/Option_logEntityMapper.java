package com.community.dao;

import com.community.entity.Option_logEntity;

public interface Option_logEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Option_logEntity record);

    int insertSelective(Option_logEntity record);

    Option_logEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Option_logEntity record);

    int updateByPrimaryKey(Option_logEntity record);
}