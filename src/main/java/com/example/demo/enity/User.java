package com.example.demo.enity;
import java.sql.Timestamp;
public class User {
   String roldId;
   String roleName;
   Timestamp creatTime;
   public void setRoldId(String roldId) {
      this.roldId = roldId;
   }
   public String getRoldId() {
      return roldId;
   }


   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }

   public Timestamp getCreatTime() {
      return creatTime;
   }

   public void setCreatTime(Timestamp creatTime) {
      this.creatTime = creatTime;
   }



   @Override
   public String toString() {
      return "User{" +
              "roldId='" + roldId + '\'' +
              ", roleName='" + roleName + '\'' +
              ", creatTime=" + creatTime +
              '}';
   }



}
