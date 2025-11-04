void setup(){
   int numRolls = 50;
   for (int r = 0 ; r < numRolls ; r++){
     print((int) random(1, 7) + ", ");
     print((int) random(1, 7));
     println();
   }
   println(averageRoll(numRolls));
}

//GOAL: Given a number of simulations, caluclate the average roll sum
  //average = the sum of my numbers, divided by the number of numbers
float averageRoll(int numRolls){
  float totalRoll = 0;
  for (int r = 0 ; r < numRolls ; r++){
    int d1 = (int) random(1, 7);
    int d2 = (int) random(1, 7);
    int currRoll = d1 + d2;
    totalRoll = totalRoll + currRoll;
  }
  return totalRoll / numRolls;
}

//GOAL: is to count how many times do I roll doubles, given a number of rolls
int countDoubles(int numRolls){
  //A
  int counter = 0;
  for (int r = 0 ; r < numRolls ; r++){
    //B
    int d1 = (int) random(1, 7);
    int d2 = (int) random(1, 7);
    if (d1 == d2){
       counter++;
    }
  }
  return counter;
}
