package com.community.dao;

import com.community.entity.EquipmentEntity;
import com.community.entity.UserEntiy;
import com.community.util.SqlBuildUtil;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface EquipmentEntityMapper {


//    @Select("type = 类名  method 方法名)
    @SelectProvider(type = SqlBuildUtil.class,method = "queryForEquipmentSql")
    EquipmentEntity queryForNameByID(Integer id);

    @SelectProvider(type = SqlBuildUtil.class,method = "queryForEquipmentSql1")
    @Results({
            @Result(column="createTime",property="create_Time",javaType = java.sql.Date.class)
    })
    List<EquipmentEntity> queryForNameByID1();

    int insert(EquipmentEntity record);

    int insertSelective(EquipmentEntity record);

    EquipmentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquipmentEntity record);

    int updateByPrimaryKey(EquipmentEntity record);
}