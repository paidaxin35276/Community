package com.community.dao;

import com.community.entity.ComplainEntity;

public interface ComplainEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComplainEntity record);

    int insertSelective(ComplainEntity record);

    ComplainEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComplainEntity record);

    int updateByPrimaryKey(ComplainEntity record);
}