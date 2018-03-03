package com.community.dao;

import com.community.entity.MypaidaxinlEntity;

public interface MypaidaxinlEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MypaidaxinlEntity record);

    int insertSelective(MypaidaxinlEntity record);

    MypaidaxinlEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MypaidaxinlEntity record);

    int updateByPrimaryKey(MypaidaxinlEntity record);
}