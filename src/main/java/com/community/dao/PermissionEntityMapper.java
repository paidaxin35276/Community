package com.community.dao;

import com.community.entity.PermissionEntity;

public interface PermissionEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}