void setup(){
  int number = 5;
  while (number < 10){
     println("The number is: " + number); 
     number = number + 1;
  }
  println("After the loop, the number is: " + number);
  
  //GOAL: count by 5s from 0 to 100
  int count = 0;
  while (count <= 100){
    print(count + ", ");
    count = count + 5;
  }
  println(":)");
  println(":(");
  
  /*
  general syntax for a while loop:
  initializing some variable
  while(condition is true){
     do stuff
     update (incrementation / decrementation)
  }
  */
  
  //GOAL: simulate a rocket countdown
    //count down from 10 to 1, and then say "blastoff!"
  int countdown = 10;
  while (countdown > 0){ // > 0 vs >= 1
     println(countdown);
     countdown = countdown - 1;
  }
   println("Blastoff!");
   
  //3, 6, 9, 12, 15, 18, 21
  int count3 = 3;
  while(count3 <= 21){
      print(count3 + ", ");
      count3 = count3 + 3; //count3 += 3;
  }
  println();
  //25, 21, 17, 13, 9, 5, 1
  int count4 = 25;
  while (count4 >= 1){ // 1 <= count4
    print(count4 + ", ");
    count4 -= 4; //count4 = count4 - 4;
  }
  println();
  //1, 2, 4, 8, 16, 32, 64
  int twos = 1;
  while (twos <= 64){
     print(twos + ", ");
     twos *= 2; //twos = twos * 2;
  }
  println();
  int exponent = 0;
  while (exponent < 7) {
     print((int) pow(2, exponent) + ", ");
     exponent++; //exponent += 1; exponent = exponent + 1;
  } //ends my while loop
  
  printNumbers(2, 5);
  printNumbers(7, 3);
  
}//ends the setup function

//GOAL: write a function, called printNumbers, that takes in two integers 
  //and prints the numbers between them
  //printNumbers(2, 5) -> 2, 3, 4, 5
  //printNumbers(7, 3) -> 7, 6, 5, 4, 3
void printNumbers(int a, int b){
  println();
  if (a < b){
     //COUNT UP 
     int walky = a;
     while (walky <= b){
        print(walky + ", ");
        walky++;
     }
  } else {
     //count DOWN 
     int walky = a;
     while (walky >= b){
        print(walky + ", ");
        walky--;
     }
  }
}
