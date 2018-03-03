package com.community.dao;

import com.community.entity.NoticeEntity;

public interface NoticeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeEntity record);

    int insertSelective(NoticeEntity record);

    NoticeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoticeEntity record);

    int updateByPrimaryKey(NoticeEntity record);
}