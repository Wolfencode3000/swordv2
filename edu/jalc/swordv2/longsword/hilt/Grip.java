package edu.jalc.swordv2.longsword.hilt;

public class Grip {

   private double length;
   private double radius;

   public Grip(){
      this.length = 0;
      this.radius = 0;
   }
   
   public Grip(double length, double radius){
      this.length = length;
      this.radius = radius;
   }
   
   public double getLength(){
      return this.length;
   }
   
   public double getRadius(){
      return this.radius;
   }
}      