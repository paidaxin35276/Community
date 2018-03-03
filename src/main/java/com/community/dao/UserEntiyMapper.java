package com.community.dao;

import com.community.entity.UserEntiy;

public interface UserEntiyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntiy record);

    int insertSelective(UserEntiy record);

    UserEntiy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntiy record);

    int updateByPrimaryKey(UserEntiy record);
}