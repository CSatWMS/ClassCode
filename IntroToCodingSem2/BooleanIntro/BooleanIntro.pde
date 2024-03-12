void setup(){
  //boolean is a NEW datatype!
  
    //true vs false  
  
  boolean firstGuy = true;
  boolean secondGuy = false;
  
  //conditional operators
    // == (are we the same?)
  boolean samesame = 7 == 7;
  boolean triedAgain = 7 == 11;
  println("SameSame is: " + samesame);
  println("TriedAgain is: " + triedAgain);
  
    // != (are we different?)
        // ! -> means not
  boolean different = 7 != 11;
  println("Different is: " + different);
  
  // > <  (Greater than , less than)
  // >= <= (greater than or equal to , less than or equal to)
  
  boolean greater = 7 > 7;
  boolean greaterOrEqual = 7 >= 7;
  println("greater: " + greater);
  println("Greater or Equal: " + greaterOrEqual);
  
  //if statement -> conditional statement
  /*
    if (boolean condition is TRUE) {
       code we want to run WHEN TRUE 
    } else {
       code we want to run WHEN FALSE 
    }
  */
  
  int number = -21;
  if (number > 0) {
    println(number + " is positive!");
  } else {
    println(number + " is negative!");
  }
  
  int age = 12;
  if (age >= 18){
     println("You can vote!"); 
  } else {
     println("womp womp you can't vote"); 
  }
  
  if (age < 15){
     println("You can't drive"); 
  } else if (age == 15){
     println("You have a permit"); 
  } else {
     println("You can drive"); 
  }

  
  if (age >=4 && age <= 12){
     println("Welcome to my bouncy castle!"); 
  } else {
     println("You can't bounce"); 
  }
  
  
  if (age < 4 || age > 12){
     println("You can't bounce"); 
  } else {
     println("Welcome to my bouncy castle!"); 
  }
  
  
  if (age < 4){
     println("You can't bounce"); 
  } else if (age > 12){
     println("You can't bounce"); 
  } else {
     println("Welcome to my bouncy castle!");
  }  
  
  
} //ends the setup function


//code : FunkyMath
   //funkyMath will take in two integers
   //when both are negative -> return the sum
   //when only one is negative -> negate the negative, then return the sum
   //when both are positive -> return the difference (num1 - num2)

int funkyMath(int num1, int num2){
   
}
