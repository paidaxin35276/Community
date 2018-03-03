package com.community.dao;

import com.community.entity.DepatmentEntity;

public interface DepatmentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepatmentEntity record);

    int insertSelective(DepatmentEntity record);

    DepatmentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DepatmentEntity record);

    int updateByPrimaryKey(DepatmentEntity record);
}