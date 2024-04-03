void setup(){
  /*
  int number = -20;
  while (number < 10){
     println(number + " is smaller than 10");
     number = number + 5;
  }
  */
  
  /*
  //GOAL: Print numbers 1 through 10 
  int number = 1;
  while (number <= 10){
     println(number);
     number = number + 1;
  }
  */
  
  /*
    a while loop has 4 pieces
    1. Initialization
    2. while( condition is true)
    3.     do something
    4.     update my condition variable
  */
  
  //GOAL: Count down from 10. When we reach 1 or 0, say "THE END"
      //10, 9, 8, 7, ..., 2, 1, THE END
  int number = 10;
  while (number > 0){
     print(number + ", ");
     number = number - 1;
  }
  println("THE END");
  
  //100, 95, 90, 85, ..., 60, 55, 50 FIRST
  //0, 3, 6, 9, ..., 18, 21 SECOND
  //1, 2, 4, 8, 16, 32, 64, 128, 256 THIRD
  
  int thirdNumber = 1;
  while (thirdNumber <= 256){
     print(thirdNumber + ", ");
     thirdNumber = thirdNumber * 2;
  }
  println("THIRD");
 
 printBetween(5, 10);
 printBetween(1, 7);
 UpOrDown(100, 1);
 UpOrDown(13, 28);
}

// when num1 is bigger than num2, count DOWN to num2
// when num1 is smaller than num2, count UP to num2
void UpOrDown(int num1, int num2){
  if (num1 > num2){
    int dude = num1;
    while (dude >= num2){
       print(dude + ", ");
       dude = dude - 1;
    }
  } else {
      printBetween(num1, num2);
  }
}


void printBetween(int num1, int num2){
    //initialize
    int guy = num1;
    //while (condition is true){
    while (guy <= num2){
      //do something
      print(guy + ", ");
      //update the condition variable
      guy = guy + 1;
    }
    println();
        
}
