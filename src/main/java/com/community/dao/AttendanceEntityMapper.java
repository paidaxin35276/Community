package com.community.dao;

import com.community.entity.AttendanceEntity;

public interface AttendanceEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttendanceEntity record);

    int insertSelective(AttendanceEntity record);

    AttendanceEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttendanceEntity record);

    int updateByPrimaryKey(AttendanceEntity record);
}