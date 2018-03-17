package com.community.dao;

import com.community.entity.MeunEntity;
import com.community.util.CommonSqlUtil;
import com.community.util.MeunSqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface MenuEntityMapper {


    @SelectProvider(type = MeunSqlUtil.class,method = "getOne")
    List<MeunEntity> getOne();//获取首页一级菜单

    @SelectProvider(type =MeunSqlUtil.class,method = "getTwo")
    List<MeunEntity> getTwo(@Param("pid") int pid);//获取首页菜单子节点
}
