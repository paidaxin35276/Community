package com.community.util;

public class VisitorBuilUtil {

    public String GetList(){
        return "select * from visitor";
    }
    public String DeleteById(Integer id){
        return  "update visitor set status=1 where id="+id;

    }
}
