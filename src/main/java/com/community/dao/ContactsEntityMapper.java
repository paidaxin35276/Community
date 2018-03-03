package com.community.dao;

import com.community.entity.ContactsEntity;

public interface ContactsEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactsEntity record);

    int insertSelective(ContactsEntity record);

    ContactsEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactsEntity record);

    int updateByPrimaryKey(ContactsEntity record);
}