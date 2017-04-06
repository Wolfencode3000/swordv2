package edu.jalc.swordv2.longsword;

public class Blade {

   private final double length;
   private final double width;

   public Blade(){
      this.length = 0;
      this.width = 0;
   }   
   
   public Blade(double length, double width){
      this.length = length;
      this.width = width;
   }
   
   public double getLength(){
      return this.length;
   }
   
   public double getWidth(){
      return this.width;
   }
}