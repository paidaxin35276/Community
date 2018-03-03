package com.community.dao;

import com.community.entity.Moring_reading_commentEntity;

public interface Moring_reading_commentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Moring_reading_commentEntity record);

    int insertSelective(Moring_reading_commentEntity record);

    Moring_reading_commentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Moring_reading_commentEntity record);

    int updateByPrimaryKey(Moring_reading_commentEntity record);
}