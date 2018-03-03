package com.community.dao;

import com.community.entity.VisitorEntity;

public interface VisitorEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitorEntity record);

    int insertSelective(VisitorEntity record);

    VisitorEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitorEntity record);

    int updateByPrimaryKey(VisitorEntity record);
}