void setup(){
  int numRolls = 5;
  //for (int diceCounter = numRolls ; diceCounter >= 0 ; diceCounter--)
 
  for (int diceCounter = 0 ; diceCounter < numRolls ; diceCounter++){
    //println("Dice Counter: " + diceCounter + ", die: " + (int) random(1, 7) + ", ");
    //println( (int) random(1, 7) + ", " + (int) random(1, 7));
    int d1 = (int) random(1, 7);
    int d2 = (int) random(1, 7);
    int sum = d1 + d2;
    println(d1 + " + " + d2 + " = " + sum);
  }
  
  int num12s = countBoxCars(1000);
  println("12s: " + num12s);
  
  int num7s = countTargetSum(1000, 7);
  println("7s: " + num7s);
  
    int num3s = countTargetSum(1000, 3);
  println("3s: " + num3s);
}

//GOAL: count how many times a target sum appears
int countTargetSum(int dieRoll, int targetSum){
  int boxCarCounter = 0;
  for(int counter = 0; counter < dieRoll; counter++){
      int d1 = (int) random(1, 7);
      int d2 = (int) random(1, 7);
      if (d1 + d2 == targetSum){
        boxCarCounter++;
      }
  }
  return boxCarCounter;
}


//GOAL: write a function called countBoxCars, which counts how many 12s are rolled
  //given the number of iterations
int countBoxCars(int dieRoll){
  int boxCarCounter = 0;
  for(int counter = 0; counter < dieRoll; counter++){
      int d1 = (int) random(1, 7);
      int d2 = (int) random(1, 7);
      if (d1 + d2 == 12){
        println("Box cars");
        boxCarCounter++;
      }
  }
  return boxCarCounter;
}
