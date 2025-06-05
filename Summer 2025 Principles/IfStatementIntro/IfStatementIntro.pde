void setup(){
   int age = 17;
   
   if (age >= 18){
     println("Go Vote!");
   } else if (age == 17){
     println("Time to register!");
   } else {
     println("Have a few birthdays..."); 
   }
   
   int number = 0;
   if (number > 0){
      println(number + " is positive"); 
   } else if (number == 0){
      println("The number is ZERO!");
   } else {
      println(number + " is negative!"); 
   }
   
   if (number % 2 == 0){
      println("EVEN"); 
   } else {
      println("ODD"); 
   }
   
   if (number % 2 == 1){
      println("ODD");
   } else if (number % 2 != 0){
      println("ODDER"); //will never happen with an int
   } else {
      println("EVEN"); 
   }
   
   //for any number less than 5 digits -> list the the number of digits
   //if my number has 5 or more digits -> it's just BIG
     //you can assume the number is positive
   number = 101; //3 digits
   if (number > 9999){ //number >= 10000
      println("That's a big number!"); 
   } else if (number > 999){
      println(number + " has 4 digits"); 
   } else if (number > 99){
      println(number + " has 3 digits"); 
   } else if (number > 9){
      println(number + " has 2 digits"); 
   } else if (number >= 0){
      println(number + " has 1 digit"); 
   } else {
      println("That's a negative number :("); 
   }
   
   
   if (number < 0){
     println("That's a negative number :("); 
   } else if (number < 10){ //number <= 9
     println(number + " has 1 digit"); 
   } else if (number < 100){
     println(number + " has 2 digits"); 
   } else if (number < 1000){
     println(number + " has 3 digits"); 
   } else if (number < 10000){
     println(number + " has 4 digits");  
   } else {
     println("That's a big number!");
   }
   
   
  // [1000 - 10000)
  //if (1000 <= number < 10000){ invalid syntax
  /*
    combining boolean expressions
    
    and - &&
      if both conditions are true, I now have a single true
      2 == 2 && 2 < 10 
         -> true     
      2 == 2 && 12 < 10 
         -> false
      
    or - ||
      if both or either condition is true, I have a single true
        both have to be false, to get a false with ||
      2 == 2 || 12 < 10
         -> true
      2 == 3 || 12 < 10
         -> false
  */
  
  println(labelNumber(17));
  println(labelNumber(-18));
  
} //ends setup


//GOAL: i want to label a number
  //even and positive
  //even and negative
  //odd and positive
  //odd and negative

String labelNumber(int num){
    if (num % 2 == 0 && num >= 0){
       return "even and positive"; 
    } else if (num % 2 == 0 && num < 0){
       return "even and negative";
    } else if (num % 2 == 1 && num >= 0){
       return "odd and positive"; 
    } else if (abs(num % 2) == 1 && num < 0){
       return "odd and negative";
    } else {
       return "should never happen";
    }
}
