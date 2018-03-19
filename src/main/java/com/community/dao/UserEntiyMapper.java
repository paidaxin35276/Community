package com.community.dao;

import com.community.entity.UserEntiy;
import com.community.util.UserBuilUtil;
import org.apache.ibatis.annotations.SelectProvider;

import java.lang.reflect.Type;

public interface UserEntiyMapper {
@SelectProvider(type = UserBuilUtil.class,method = "Login")
   UserEntiy Login(String username,String password);
}