package com.community.util;

public class EquipmentBuildUtil {

    //数据绑定
    public String queryForEquipmentSql1(){
        return "select * from equipment";
    }

    //增加数据insertForEquipmentSql1
    public  String addForEquipmentSql1(){
        return "insert into equipment('name', 'startus ', 'describe', 'create_time', 'create_who', 'edit_time', 'edit_who', 'isDelete') values ('? ', '?', '?', '?', '?', '?', '?', '?')";
    }

    //修改数据
    public  String updateForEquipmentSql1(){
        return "update equipment set name='?',startus='?',describe='?',create_time='?',create_who='?',edit_time='?',edit_who='?',isDelete='?' where id='?'";
    }

    //删除数据
    public  String delForEquipmentSql1(Integer id){
        return "delete from equipment where id="+id;
    }

}
