void setup(){
    //modulus
      // % (remainder operator)
      
   println(17 % 5);
   println(20 % 5);
   println(20 % 5 == 0);
   println(21 % 5 == 0);
   
   //even numbers
   //numbers divisible by 5
   //both (even and divisible by 5)
   
   //for (init ; condition ; update)
   for (int num = 1; num <= 20; num++){
     if (num % 2 == 0 && num % 5 == 0){
       println(num + " is a multiple of 10!");
     } else if (num % 2 == 0){
        println(num + " is even!"); 
     } else if (num % 5 == 0){
        println(num + " is a multiple of 5!"); 
     }
   }
   
   
   //print prime numbers only
   for (int i = 3; i <= 25; i++){
      boolean isPrime = true;
       for (int divisor = 2; divisor < i; divisor++){
          //if the number is NOT prime
          if (i % divisor == 0){
             //println(i + " is NOT prime"); 
             isPrime = false;
          }
       }
       if (isPrime == true){
          println(i + " IS PRIME"); 
       }
   }
   
   for (int i = 1; i <= 10; i++){
      //int wholeNumber = int(7.2);
      int d1 = int(random(1, 7));
      int d2 = int(random(1, 7));
      println(d1 + ", " + d2);
   }
   
   //keep rolling UNTIL I get doubles
   int d1 = int(random(1, 7));
   int d2 = int(random(1, 7));
   int counter = 1;
   int tripleDouble = 0;
   while (tripleDouble < 3){
     d1 = int(random(1, 7));
     d2 = int(random(1, 7));
     counter++;
     if (d1 == d2){
         tripleDouble++;
     } else {
        tripleDouble = 0; 
     }
   }
   println(d1 + ", " + d2 + " in " + counter + " rolls!");
   println("Triple Double in: " + counter + " rolls!");
   
   
   
   
   
   
   
}
