package edu.jalc.swordv2;

import edu.jalc.swordv2.longsword.Blade;
import edu.jalc.swordv2.longsword.Hilt;
import edu.jalc.swordv2.Scabbard;

public class LongSword {
	
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
	

}