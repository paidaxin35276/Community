package com.community.util;

import java.util.Map;

public class Owner_eventBuildUtli {

    public String GetSelet(){
        return "select * from owner_event where isDelete=0";
    }

   public String Deletes(Integer id){
       return "update owner_event set isDelete=1 where id="+id;
   }
}
