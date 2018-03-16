package com.community.dao;

import com.community.entity.ComplainEntity;
import com.community.util.ComplainBuilUtil;
import com.community.util.Engineer_orderBuilUtil;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ComplainEntityMapper {

    @SelectProvider(type = ComplainBuilUtil.class,method = "queryComplain")
    List<ComplainEntity> queryComplain();


    @DeleteProvider(type = ComplainBuilUtil.class,method = "delForComplain")
    int delComplain(Integer id);

}