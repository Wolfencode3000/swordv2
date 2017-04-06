package edu.jalc.swordv2.scabbard;

import edu.jalc.swordv2.color.RGBColor;

public class CoatOfArms {

   private final RGBColor rgbColor;

   public CoatOfArms(){
      this.rgbColor = null;
   }
   
   public CoatOfArms(RGBColor rgbColor){
      this.rgbColor = rgbColor;
   }
   
   public RGBColor getrgbColor(){
      return rgbColor;
   }
}