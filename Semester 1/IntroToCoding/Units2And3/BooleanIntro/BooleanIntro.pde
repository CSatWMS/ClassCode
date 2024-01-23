void setup(){
   boolean first = true;
   boolean second = false;
   /*
   
   boolean operator
   >
   <
   >=
   <= (less than or equal to)
   == (equals equals)
   != (not equals)
   
   */
   
   int age = 16;
   boolean canVote = age >= 18;
   println(canVote);
   
   boolean canHavePermit = age > 14;
   println(canHavePermit);
   
   boolean isCentennial = age == 100;
   println(isCentennial);
   
   //conditional statements
     //if statements
     //all about making decisions
   /*
     if (condition){
       do something when the condition is TRUE
     } else if (condition2){
       do this when condition1 is FALSE, but condition2 is TRUE
     } else {
       do this when the condition is FALSE
     }
   */
   
   if (age >= 18) {
     println("Go vote at the polls!");
   } else {
     println("Have a couple birthdays");
   }
   if (age < 18){
      println("Have a couple birthdays"); 
   }
   
   posOrNeg(7);
   posOrNeg(-7);
   posOrNeg(0);
   
   whatToWear(40, true);
   whatToWear(80, false);
}

void posOrNeg(int number){
   if (number > 0){
      println("Positive"); 
   } else if (number == 0){
     println("ZERO");
   } else {
      println("Negative"); 
   }
}

void whatToWear(int temperature, boolean isItRaining){
  //when do I wear a jacket?
  //when do I wear rain boots?
  if (isItRaining == true){
     println("Wear rainboots"); 
  }
  
  if (isItRaining == true || temperature < 60){
   println("Wear a jacket"); 
  }
  
  //if it's nice weather -> bring out the jorts
  if (isItRaining == false && temperature >= 67){
     println("Bring out the jorts"); 
  }
  
  /*
    OR -> || -> combines boolean expressions into a single true when:
        at least ONE of the expressions is TRUE
    AND -> && -> but BOTH expressions must be true to result in a single true
  */
}
