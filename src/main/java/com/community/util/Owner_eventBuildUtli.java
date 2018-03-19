package com.community.util;

import com.community.entity.Owner_eventEntity;

import java.util.Map;

public class Owner_eventBuildUtli {

    public String GetSelet(){
        return "select * from owner_event where isDelete=0";
    }

   public String Deletes(Integer id){
       return "update owner_event set isDelete=1 where id="+id;
   }
  /* public String AddOwner_event(){
        return "insert into equipment(owner_id, event_content, type, create_time, create_time,create_who,isDelete) values ('"+Owner_eventEntity.o+"', "+equipmentEntity.event_content()+", '"+equipmentEntity.type()+"', '"+equipmentEntity.getCreate_time()+"', "+create_who+",0);
    }*/

}
