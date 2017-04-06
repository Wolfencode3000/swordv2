package edu.jalc.swordv2.color;

public class RGBColor {

   private final byte red;
   private final byte green;
   private final byte blue;

   private RGBColor(){
      this.red = 0;
      this.green = 0;
      this.blue = 0;
   }

   public RGBColor(byte red, byte green, byte blue){
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public byte getRed() {
      return red;
   }

   public byte getGreen() {
      return green;
   }

   public byte getBlue() {
      return blue;
   }
}