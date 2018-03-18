package com.community.dao;

import com.community.entity.OwnerEntity;
import com.community.util.OwnerBuilUtil;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface OwnerEntityMapper {
    @SelectProvider(type = OwnerBuilUtil.class,method="GetAll")
    List<OwnerEntity> GetAlls();

    @DeleteProvider(type = OwnerBuilUtil.class,method = "Del")
    void DelById(Integer id);
}