public interface Longsword Builder{

   LongswordBuilder add Blade(blade);
   LongswordBuilder add Hilt(hilt);
   LongswordBuilder add Scabbard(scabbard);
   
   Longsword build(){
      Longsword longsword = new Longsword
   }
}  

public interface Hilt builder{
      HiltBuilder add Crossguard(crossguard);
      HiltBuilder add Grip(grip);
      HiltBuilder add Pommel(pommel);
   
   Hilt build(){
      Hilt hilt = new Hilt
   }
}   

public interface Scabbard Builder{
   Scabbard add CoatOfArms(coatOfArms);
 
   Scabbard build(){
      Scabbard scabbard = new Scabbard
   }
}