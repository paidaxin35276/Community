package com.community.dao;

import com.community.entity.ComplainEntity;
import com.community.util.ComplainBuilUtil;
import com.community.util.Engineer_orderBuilUtil;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface ComplainEntityMapper {

    @SelectProvider(type = ComplainBuilUtil.class,method = "queryComplain")
    List<ComplainEntity> queryComplain();

//    @
    @InsertProvider(type=ComplainBuilUtil.class,method = "addComplained")
    String addComplain(ComplainEntity complainEntity);

    @UpdateProvider(type=ComplainBuilUtil.class,method = "updateComplained")
    String updateComplain(ComplainEntity complainEntity);

    @DeleteProvider(type = ComplainBuilUtil.class,method = "delForComplain")
    int delComplain(Integer id);

}