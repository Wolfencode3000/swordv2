package edu.jalc.swordv2.longsword.hilt;

public class Pommel {

   private double length;
   private double width;
   private double radius;

   public Pommel(){
      this.length = 0;
      this.width = 0;
      this.radius = 0;
   }
   
   public Pommel(double length, double width, double radius){
      this.length = length;
      this.width = width;
      this.radius = radius;
   }
      public double getlength(){
         return this.length;
      }
      public double getwidth(){
         return this.width;
      }
      public double getradius(){
         return this.radius;
      }
}