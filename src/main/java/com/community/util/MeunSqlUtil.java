package com.community.util;

import java.util.Map;

public class MeunSqlUtil {
    public String getOne(){
        return "select * from meun where pid = 1";
    }

    public String  getTwo(Map<String, Object> parameter){
        return "select * from meun where pid = "+parameter.get("pid");
    }
}
