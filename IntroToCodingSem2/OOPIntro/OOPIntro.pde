void setup(){
  Cup myCoffeeCup = new Cup("green", 16, 6, true);
  println(myCoffeeCup.myColor);
  println(myCoffeeCup.howFull());
  myCoffeeCup.fillUp(10);
  println(myCoffeeCup.howFull());
  
  Cup annekesStanley = new Cup("lavender", 40, 40, true);
  println(annekesStanley.actualVolume);
  println(annekesStanley.howFull());
  annekesStanley.fillUp(10);
  println(annekesStanley.howFull());
  
}  


class Cup {
   String myColor;
   float totalVolume;
   float actualVolume;
   boolean hasLid;
   
   //constructor
   //it always starts public ClassName
   //it will have parameter variables to accept initial values
   public Cup(String col, float tot, float act, boolean hL){
      myColor = col;
      totalVolume = tot;
      actualVolume = act;
      hasLid = hL;
   }
   
   String howFull(){
     if (actualVolume > totalVolume){
        return "AHHH OVERFLOW!"; 
     } else if (actualVolume == totalVolume){
        return "Perfectly full"; 
     } else {
        return "You're good"; 
     }
   }
   
   void fillUp(float amountToFill){
     actualVolume = actualVolume + amountToFill;
     println("glugglugglug");
   }
  
} //ends the class
