package edu.jalc.swordv2.longsword;

import edu.jalc.swordv2.longsword.hilt.Crossguard;
import edu.jalc.swordv2.longsword.hilt.Grip;
import edu.jalc.swordv2.longsword.hilt.Pommel;

public class Hilt {

   private Crossguard crossguard;
   private Grip grip;
   private Pommel pommel;
   
   private Hilt() throws Exception{
      this.setCrossguard(null);
      this.setGrip(null);
      this.setPommel(null);
   }

   public Hilt(Crossguard crossguard, Grip grip, Pommel pommel) throws Exception{
      this.setCrossguard(crossguard);
      this.setGrip(grip);
      this.setPommel(pommel);
   }
   
   public Crossguard getCrossguard(){
      return this.crossguard;
   }
   
   public Grip getGrip(){
      return this.grip;
   }
   
   public Pommel getPommel(){
      return this.pommel;
   }
   
   public Hilt setCrossguard(Crossguard crossguard){
      this.crossguard = crossguard;
      return this;
   }
   
   public Hilt setGrip(Grip grip){
      this.grip = grip;
      return this;
   }
   
   public Hilt setPommel(Pommel pommel){
      this.pommel = pommel;
      return this;
   }
}