package com.community.dao;

import com.community.entity.Engineer_orderEntity;
import com.community.util.Engineer_orderBuilUtil;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface Engineer_orderEntityMapper {

    @SelectProvider(type = Engineer_orderBuilUtil.class,method = "queryEngineer_order")
    List<Engineer_orderEntity> queryEngineer_order();


    @DeleteProvider(type = Engineer_orderBuilUtil.class,method = "delForEngineerOrderSql1")
    int delEngineerOrder(Integer id);

}