package com.community.util;

public class SqlBuildUtil {

    public  String queryForEquipmentSql(Integer id){
        return "select * from equipment where id ="+id;
    }
    public  String queryForEquipmentSql1(){
        return "select * from equipment where 1=1";
    }
    public  String insertForEquipmentSql1(){
        return "insert into equipment('name', 'startus ', 'describe', 'create_time', 'create_who', 'edit_time', 'edit_who', 'isDelete') values ('? ', '?', '?', '?', '?', '?', '?', '?')";
    }

}
