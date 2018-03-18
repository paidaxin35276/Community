package com.community.dao;

import com.community.entity.Owner_eventEntity;
import com.community.util.OwnerBuilUtil;
import com.community.util.Owner_eventBuildUtli;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface Owner_eventEntityMapper {
    @SelectProvider(type = Owner_eventBuildUtli.class,method="GetSelet")
    List<Owner_eventEntity> owner_event();

    @DeleteProvider(type = Owner_eventBuildUtli.class,method = "Deletes")
    void DeleteByIds(Integer id);

}