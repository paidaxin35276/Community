package com.community.util;

public class ComplainBuilUtil {

    public String queryComplain(){
        return "select * from complain";
    }

    //删除数据
    public  String delForComplain(Integer id){
        return "delete from complain where id="+id;
    }

}
