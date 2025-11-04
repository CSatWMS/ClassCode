void setup(){
   int numEvens = countDivisible(0, 10, 2);
   int numDivis = countDivisible(1, 12, 3);
   println(numEvens);
   println(numDivis);
}
/*
Write a function, countDivisible, that takes in three integers:
  start
  end
  divisor
Count the number of numbers that are divisble between a start and end point
*/
int countDivisible(int start, int end, int divisor){
    int fingers = 0;
    int movingNumber = start;
    while (end >= movingNumber){ //movingNumber <= end
       if (movingNumber % divisor == 0){
          fingers++; 
       }
       movingNumber++;
    }
    return fingers;
}
