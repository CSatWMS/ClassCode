void setup(){
    int numEvens = countDivisible(0, 10, 2);
    int numDivis = countDivisible(1, 12, 3);
    println(numEvens);
    println(numDivis);
}

// Count the number of numbers that are divisble (by the divisor) 
// between a start and end point

int countDivisible(int start, int end, int divisor){
   int tallyMarks = 0;
   int testNumber = start;
   while (testNumber <= end) {
      if (testNumber % divisor == 0){
         tallyMarks++; 
      }
      testNumber++;
   }
   return tallyMarks;
}
