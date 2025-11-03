void setup() {
  int numPancakes = countDivisible(0, 10, 2);
  int flyingPigs = countDivisible(1, 12, 3);
  println(numPancakes);
  println(flyingPigs);
}

/*
Write a function, countDivisible, that takes in three integers:
 start
 end
 divisor
Count the number of numbers that are divisble between a start and end point
*/
int countDivisible(int start, int end, int divisor) {
  //make counter
  int tallyCounter = 0;
  int currNumber = start;
  //while loop?
  while (currNumber <= end){
    //if divisible
    if (currNumber % divisor == 0){ //divisibility check
      //counter++?
      tallyCounter++;
    }
    currNumber++;
  }
  //return counter?
  return tallyCounter;
}
