void setup(){
  boolean answer = primeOrNot(7);
  println("7 prime? " + answer);
  println("15 prime? " + primeOrNot(15));
  println("1 prime? " + primeOrNot(1));
  println("2 prime? " + primeOrNot(2));
  println("3 prime? " + primeOrNot(3));
  listPrimes(17);
}

//GOAL: given a number as a parameter, list only the prime numbers between 1 and that number
//listPrimes(17) -> 1, 2, 3, 5, 7, 11, 13, 17
void listPrimes(int maxNumber){
   //init
   int janet = 1;
   //while (cond)
   while (janet <= maxNumber){
     //do something (if I'm prime, print me out?)
     if (primeOrNot(janet) == true){
       print(janet + ", ");
     }
     //update
     janet++;
   }
}

//Prime Numbers: 7, 11, 3, 41
//GOAL: given a number, determine whether or not it is prime
//returnType funcName(parameter(s))
boolean primeOrNot(int number){
    //init -> the number we're dividing by
    int philip = 2;
    //while (condition)
    while (philip < number){
      //do something -> divisibility check
      if (number % philip == 0){
        return false;
      } /*else {
        return true; //WRONG ANSWER
      }*/
      //update -> changing the number we're dividing by
      philip++;
    }//ends the while loop
    //if I return false, can I ever execute HERE?
    return true;
}

boolean isPrime(int number){
   int divisor = 2;
   while (divisor < number){
      if (number % divisor == 0){
         return false; 
      }
      divisor++;
   }
   return true;
}
