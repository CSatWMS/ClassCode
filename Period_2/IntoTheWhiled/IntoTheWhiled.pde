void setup(){
    int number = 5;
    while (number < 10){
       println("The number is: " + number); 
       number = number + 1;
    }
    println("After the loop, the number is : " + number);
    
    //GOAL: count by 5's from 0 to 100
    int count = 0;
    while (count <= 100){
       print(count + ", ");
       count = count + 5;
    }
    println();
    println(":)");
    println(":(");
    
    /*
    general syntax for a while loop:
    initialize a variable
    while (condition is true){
       do stuff
       update (incrementation / decrementation)
    }
    
    */
    
    //GOAL: count down from 10 to 1, and then say "blastoff!"
    int rocket = 10;
    while (rocket >= 1){
      println(rocket);
      rocket = rocket - 1; //rocket--; rocket -= 1;
    }
    println("blastoff!");
    
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
    int twos = 1;
    while (twos <= 64){
       print(twos + ", ");
       twos *= 2; //twos = twos * 2;
    }
    println();
    int exponent = 0;
    while (exponent < 7) { //exponent <= 6
      print((int) pow(2, exponent) + ", ");
      exponent ++; //exponent = exponent + 1; exponent += 1;
    }
    
    printNumber(2, 5);
    printNumber(7, 3);
    
} // this curly ends setup

//write a function, called printNumbers, that takes in two integer parameters
  //count up or down appropriately
  //printNumbers(2, 5) -> 2, 3, 4, 5
  //printNumber(7, 3) -> 7, 6, 5, 4, 3

void printNumber(int a, int b){
    
}
