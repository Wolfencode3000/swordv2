package edu.jalc.swordv2;

import edu.jalc.swordv2.longsword.Blade;
import edu.jalc.swordv2.longsword.Hilt;
import edu.jalc.swordv2.Scabbard;

public class LongSword implements Slash, Thrust, Cleave, Parry, Sheath {
	
   private Hilt hilt;
   private final Blade blade;
   private Scabbard scabbard;
	

   private LongSword() throws Exception {
      this.hilt = null;
      this.blade = null;
      this.scabbard = null;
   }
	

   public LongSword(Hilt hilt, Blade blade, Scabbard scabbard) throws Exception {
   
      this.hilt = hilt;
      this.blade = blade;
      this.scabbard = scabbard;
   }
	
   public void slash() { 
      System.out.println("Performs slash attack"); 
   } 
      
   public void thrust(){ 
      System.out.println("Performs thrust attack");
   }

   public void cleave(){
      System.out.println("Performs cleave attack");
   }

   public void parry(){
      System.out.println("Parry attack with Longsword");
   }

   public void sheath() { 
      System.out.println("Sheaths Longsword in scabbard"); 
   }
       
   public void unsheath(){ 
      System.out.println("Unsheath Longsword from scabbard");
   }


}