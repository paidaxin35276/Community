package com.community.dao;

import com.community.entity.DeptmentEntity;

public interface DeptmentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeptmentEntity record);

    int insertSelective(DeptmentEntity record);

    DeptmentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptmentEntity record);

    int updateByPrimaryKey(DeptmentEntity record);
}