package com.community.util;

public class Engineer_orderBuilUtil {

    public String queryEngineer_order(){
        return "select * from engineer_order where isdelete = 0";
    }

    //删除数据
    public  String delForEngineerOrderSql1(Integer id){
        return "update `engineer_order` set isdelete = 1 where id="+id;
    }

}
