void setup(){
  int number = 5; //initialized a variable
  while (number < 10){ //condition -> runs while its true
     println("The number is: " + number); //doing something
     number = number + 1; //update (or incrementation)
  }
  println("After the loop, the number is: " + number);
  
  //goal: print numbers from 0 to 100, counting by 5s;
  int count = 0;
  while (count <= 100){
    print(count + ", ");
    count = count + 5;
  }
  println(":)");
  println(":(");
  
  /*
    general syntax for a while loop:
    variable initialization
    while (condition is true){
      do stuff
      update
    }  
  */
  
  //GOAL: print a countdown, starting at 10, go down to 1, and then say "blastoff!"
  int rocket = 10;
  while (rocket > 0){  //could also say rocket >= 1
      println(rocket);
      rocket = rocket - 1; //rocket--; rocket -= 1;
  }
  println("Blastoff!");
  
  //3, 6, 9, 12, 15, 18, 21
  int count3 = 3;
  while (count3 <= 21){
     print(count3 + ", ");
     count3 += 3; //count3 = count3 + 3;
  }
  println();
  //25, 21, 17, 13, 9, 5, 1
  int count4 = 25;
  while (count4 >= 1){
     print(count4 + ", ");
     count4 -= 4; //count4 = count4 - 4;
  }
  println();
  //1, 2, 4, 8, 16, 32, 64
  int result = 1;
  while (result <= 64){
     print(result + ", ");
     result *= 2;
  }
  println();
  
  int exponent = 0;
  while (exponent < 7){
     print((int) pow(2, exponent) + ", ");
     exponent++;
  }
  
  printNumbers(2, 5);
  printNumbers(7, 3);
} //curly for setup

//GOAL: write a function that counts up or down from parameter a to parameter b
//printNumbers(2, 5) -> (2, 3, 4, 5)
//printNumbers(7, 3) -> (7, 6, 5, 4, 3)
void printNumbers(int a, int b){
  println();
  if (a < b){
     //count UP
     int counter = a;
     while (counter <= b){
        print(counter + ", ");
        counter++;
     } //ends the while
  } //ends the if
  else {
     //count DOWN
     int counter = a;
     while (counter >= b){
        print(counter + ", ");
        counter--;
     }
  }
  println();
} //ends the function
