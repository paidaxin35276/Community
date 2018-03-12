package com.community.dao;

import com.community.entity.EquipmentEntity;
import com.community.util.EquipmentBuildUtil;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EquipmentEntityMapper {


    //    @Select("type = 类名  method 方法名)

    //数据绑定
    @SelectProvider(type = EquipmentBuildUtil.class,method = "queryForEquipmentSql1")
    List<EquipmentEntity> queryForNameByID1();

    //增加数据
    @InsertProvider(type=EquipmentBuildUtil.class,method = "addForEquipmentSql1")
    void addEquipmentSql1(EquipmentEntity equipmentEntity);

    //修改数据
    @UpdateProvider(type=EquipmentBuildUtil.class,method = "updateForEquipmentSql1")
    void updateEquipmentSql1(EquipmentEntity equipmentEntity);

    //删除数据
    @DeleteProvider(type=EquipmentBuildUtil.class,method = "delForEquipmentSql1")
    void delEquipmentSql1(Integer id);
}