package com.community.util;

public class OwnerBuilUtil {
    public String GetAll(){
        return "select * from owner where isDelete = 0";
    }
   public String Del(Integer id){
        return "update owner set isDelete = 1 where id="+id;
    }

  /*public String Del(Integer id){
      return "delete owner where id="+id;


  }*/
}
