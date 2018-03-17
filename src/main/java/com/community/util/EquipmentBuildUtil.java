package com.community.util;

import com.community.entity.EquipmentEntity;

public class EquipmentBuildUtil {

    //数据绑定
    public String queryForEquipmentSql1(){
        return "select * from equipment where isdelete = 0";
    }

    //增加数据insertForEquipmentSql1
    public  String addForEquipmentSql1(EquipmentEntity equipmentEntity){
        int create_who = 0;
        if (null==equipmentEntity.getCreate_who()){

        }else{
                create_who = equipmentEntity.getCreate_who();
        }
        return "insert into equipment(ename, startus, edescribe, create_time, create_who,isdelete) values ('"+equipmentEntity.getEname()+"', "+equipmentEntity.getStartus()+", '"+equipmentEntity.getEdescribe()+"', '"+equipmentEntity.getCreate_time()+"', "+create_who+",0)";
    }

    //修改数据
    public  String updateForEquipmentSql1(EquipmentEntity equipmentEntity){
        int edit_who = 0;
        if (null==equipmentEntity.getEdit_who()){

        }else{
            edit_who = equipmentEntity.getEdit_who();
        }
        return "update equipment set ename='"+equipmentEntity.getEname()+"',startus='"+equipmentEntity.getStartus()+"',edescribe='"+equipmentEntity.getEdescribe()+"',edit_time='"+equipmentEntity.getEdit_time()+"',edit_who="+edit_who+" where id='"+equipmentEntity.getId()+"'";
    }

    //删除数据
    public  String delForEquipmentSql1(Integer id){
        return "update equipment set isdelete = 1 WHERE id = "+id;
    }

}
