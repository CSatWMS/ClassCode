void setup(){
  
  boolean answer = grabABottle(18);
  println(answer);
  
  println(grabABottle(2));
  
  println(bottleExtension(18, 0));
  println(bottleExtension(2, 45));
  println(bottleExtension(3, 45));
  
}

//returnType functionName(dt varName)
boolean grabABottle(int hour){
   //if (hour == 0 || hour == 3){ }
   if (hour % 3 == 0){
      return true;
   } else {
      return false; 
   }
}

boolean bottleExtension(int hour, int minute){
  if (hour % 3 == 0 && minute <= 30){
     return true; 
  } else if (hour % 3 == 2 && minute >= 30){
     return true; 
  } else {
     return false;
  }  
}

//  println(bottleExtension(18, 0));
//  println(bottleExtension(2, 45));
//  println(bottleExtension(3, 45));
