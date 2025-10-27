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
   }
   
   fancyPrint(3, 11);
} //ends the setup function

//write a function, called FancyPrint, that takes in two integers
  // add labels to some numbers
  //even -> divisible by 2
  //round -> divible by 5
  //both -> divisible by 5 and 2
  
  //FancyPrint(3, 11)
    //3
    //4 - even
    //5 - round
    //6 - even
    //7
    //8 - even
    //9
    //10 - both
    //11
void fancyPrint(int small, int big){
  println();
  int walky = small;
  while (walky <= big){
    if (walky % 2 == 0 && walky % 5 == 0){
      println(walky + " - both");
    } else if (walky % 2 == 0){
      println(walky + " - even");
    } else if (walky % 5 == 0){
      println(walky + " - round");
    }else {
    println(walky);
    }
    walky++;
  }
  
  
}


int add(int a, int b){
   return a + b; 
}
