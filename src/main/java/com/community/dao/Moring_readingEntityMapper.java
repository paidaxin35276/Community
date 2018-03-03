package com.community.dao;

import com.community.entity.Moring_readingEntity;

public interface Moring_readingEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Moring_readingEntity record);

    int insertSelective(Moring_readingEntity record);

    Moring_readingEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Moring_readingEntity record);

    int updateByPrimaryKey(Moring_readingEntity record);
}