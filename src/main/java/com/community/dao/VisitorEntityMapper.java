package com.community.dao;

import com.community.entity.VisitorEntity;
import com.community.util.VisitorBuilUtil;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface VisitorEntityMapper {
    @SelectProvider(type = VisitorBuilUtil.class,method = "GetList")
    List<VisitorEntity> visitor();
    @DeleteProvider(type =VisitorBuilUtil.class,method ="DeleteById" )
    void deletebyId(Integer id);

}