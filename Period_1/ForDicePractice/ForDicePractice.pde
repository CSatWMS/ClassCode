void setup(){
  int numRolls = 50;
  for (int rollCounter = 0 ; rollCounter < numRolls ; rollCounter++){
    println((int) random(1, 7) + ", " + (int) random(1, 7));
  }
  
  println(countSpecial(numRolls));
  println(averageRoll(numRolls));
}

//GOAL: given a number of rolls, count the number of snake eyes and box cars
int countSpecial(int numRolls){
  int count = 0;
  for (int rollCounter = 0 ; rollCounter < numRolls ; rollCounter++){
    //roll two random die
    int d1 = (int) random(1, 7);
    int d2 = (int) random(1, 7);
    if (d1 == 1 && d2 == 1){
       count++; //count = count + 1
    } else if (d1 == 6 && d2 == 6){
       count++;
    }
  }
  return count;
}

//GOAL: calculate the average outcome of two die given a number of rolls
  //average: add all the numbers and divide by the number of numbers
  
float averageRoll(int numRolls){
  float sumOfNumbers = 0; 
  for (int roll = 1 ; roll <= numRolls ; roll++){
    sumOfNumbers += (int) random(1, 7);
    sumOfNumbers += (int) random(1, 7);
    
    /*
    int d1 = (int) random(1, 7);
    int d2 = (int) random(1, 7);
    int rollSum = d1 + d2;
    sumOfNumbers += rollSum;
    */
  }
  
  return sumOfNumbers / numRolls;
}
