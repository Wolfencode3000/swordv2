package edu.jalc.swordv2;

import edu.jalc.swordv2.scabbard.CoatOfArms;
import edu.jalc.swordv2.color.RGBColor;

public class Scabbard {

   private CoatOfArms coatOfArms;
   private final RGBColor rgbColor;

   public Scabbard(){
      this.coatOfArms = null;
      this.rgbColor = null;
   }
   
   public Scabbard(CoatOfArms coatOfArms, RGBColor rgbColor){
      this.coatOfArms = coatOfArms;
      this.rgbColor = rgbColor;
   }
   
   public CoatOfArms getCoatOfArms(){
      return this.coatOfArms;
   }
   
   public RGBColor getRGBColor(){
      return this.rgbColor;
   }
   
   public Scabbard setCoatOfArms(CoatOfArms coatOfArms){
      this.coatOfArms = coatOfArms;
      return this;
   }
     
}