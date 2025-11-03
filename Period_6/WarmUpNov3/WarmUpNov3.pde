void setup(){
  int numEvens = countDivisible(0, 10, 2);
  int numDivis = countDivisible(1, 12, 3);
  println(numEvens); //should be 6
  println(numDivis); //should be 4
}
/*
Write a function, countDivisible, that takes in three integers:
  start
  end
  divisor

Count the number of numbers that are divisble (by the divisor) 
between a start and end point
*/
int countDivisible(int start, int end, int divisor){
    int fingerCount = 0;
    int numWereOn = start;
    while (numWereOn <= end){
      if (numWereOn % divisor == 0){
         fingerCount++;
      }
      numWereOn++;
    }  
    return fingerCount;
}
