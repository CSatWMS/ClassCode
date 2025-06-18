void setup(){
   IntList numbers = new IntList(7, 5, 1, 3);
   printOdds(numbers);
   println(containsEven(numbers));
   IntList oddsAndEvens = new IntList(7, 5, 8, 1, 3);
   println(containsEven(oddsAndEvens));
}

//GOAL: Determine if ALL numbers are odd -> return TRUE
  //flip it to the opposite ANY problem
      // if ANY number is even -> return FALSE
boolean hasONLYOdds(IntList list){
   for (int i = 0; i < list.size(); i++){
       if (list.get(i) % 2 == 0){
         return false;
       }
   }
   return true; //I never returned false, I never saw an even number
       // they must be all odd
   
   /*boolean answer = true;
   for (int i = 0; i < list.size(); i++){
       if (list.get(i) % 2 == 0){
          answer = false; 
       }
   }
   return answer;*/
}



//GOAL: Determine whether a list contains ANY even number
  //use a boolean variable to keep track
boolean containsEvenUsingVar(IntList list){
   boolean answer = false;
   for (int i = 0; i < list.size(); i++){
       if (list.get(i) % 2 == 0){
           answer = true;
       } 
       //else {
       //   answer = false; // REAL BAD 
       // Ends up deciding based on last number
       //}
   }
   return answer;
}

//GOAL: Determine whether a list contains ANY even number
boolean containsEven(IntList list){
    for (int i = 0; i < list.size(); i++){
        if (list.get(i) % 2 == 0){
           return true; //ends the function, makes the answer true
        } 
        // else {
          // return false; //REAL BAD 
          //will only run loop once, and often give wrong answer
        //}
    }
    return false; //outside of the loop. I never returned true
}

//GOAL: print the odd numbers
void printOdds(IntList list){
    for (int i = 0; i < list.size(); i++){
        if (list.get(i) % 2 == 1){
           print(list.get(i) + ", "); 
        }
    }
    println();
}
