package com.community.dao;

import com.community.entity.MeunEntity;

import java.util.List;

public interface MenuEntityMapper {


    List<MeunEntity> getOne();//获取首页一级菜单

    List<MeunEntity> getTwo(Integer id);//获取首页菜单子节点
}
