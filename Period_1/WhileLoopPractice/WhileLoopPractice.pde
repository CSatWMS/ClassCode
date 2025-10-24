void setup(){
  //1, 3, 5, 7, 9
   int num1 = 1;
   while (num1 <= 9){
      print(num1 + ", ");
      num1+=2;
   }
   println();
   //25, 20, 15, 10, 5, 0, -5, -10
   int num2 = 25;
   while (num2 >= -10){
      print(num2 + ", ");
      num2 -= 5;
   }
   println();
   //81, 27, 9, 3, 1
   int num3 = 81;
   while (num3 >= 1){
      print(num3 + ", ");
      num3 /= 3;
   } //ends last while
   
   printEvens(10);
   printEvens(13);
} //ends setup

//GOAL: Print even numbers from 0 to param
void printEvens(int number){
    println();
   int mover = 0;
   while (mover <= number){
      if (mover % 2 == 0){
        print(mover + ", ");
      }
      mover++;
   }
   
   fancyPrint(17);
}

//GOAL: with an integer parameter, print all the numbers from zero
  //to the param. 
    //when the number is even, label it even
    //when the number is divisible by 5, label it round
    //when it's divisible by 2 and 5, label it both
    
    //fancyPrint(7)  
        //1
        //2 - even
        //3
        //4 - even
        //5 - round
        //6 - even
        //7
void fancyPrint(int max){
   println();
   int counter = 0;
   while (counter <= max){
     print(counter);
      if (counter % 2 == 0 && counter % 5 == 0){
         print(" - both"); 
      } else if (counter % 2 == 0){
         print(" - even"); 
      } else if (counter % 5 == 0){
         print(" - round"); 
      } 
      println();
      counter++;
   }
}
