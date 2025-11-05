/*
  init
  while (condition)
    do something 
    update
    
  for (init ; condition ; update)
    do something
    
    while loops are also good at indeterminant end points
*/

void setup(){
    int numRolls = 10;
    for (int rollCount = 0 ; rollCount < numRolls ;  rollCount++){
      //do something -> roll dice
      println((int) random(1, 7) + ", " + (int) random(1, 7));
    }
    
    int num7s = countTargetRoll(7, numRolls);
    println("7s: " + num7s);
    int num12s = countTargetRoll(12, numRolls);
    println("12s: " + num12s);
    println(calcAvgRoll(100));
}

//GOAL: given a number of rolls, calculate the average sum of two dice rolling
  //an average is: the sum of all the numbers divided by the number of numbers
float calcAvgRoll(int numRolls){
   float sumOfAllNumbers = 0; //FLOAT, not int
   for (int i = 1; i <= numRolls; i++){
      int d1 = (int) random(1, 7);
      int d2 = (int) random(1, 7);
      int mySum =  d1 + d2;
      sumOfAllNumbers += mySum;
   }
   
   return sumOfAllNumbers / numRolls;
}

//Given a target sum, and a number of rolls, count how many times the target is rolled

int countTargetRoll(int targetSum, int numRolls){
  int count = 0;
  println("BEGIN SIMULATION: " + targetSum + ", in " + numRolls + " rolls");
  for (int rollCount = 0 ; rollCount < numRolls ;  rollCount++){
      int d1 = (int) random(1, 7);
      int d2 = (int) random(1, 7);
      int mySum =  d1 + d2;
      println(d1 + ", " + d2 + " = " + mySum);
      if (mySum == targetSum){
        count++;
      }
  }
  return count;
}
