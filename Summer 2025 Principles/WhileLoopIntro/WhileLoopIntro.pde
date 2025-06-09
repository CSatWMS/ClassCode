void setup(){
    /*print("hello");
    println("goodbye");
    println("hola");*/
    int number = 5;
    while (number < 10){
       println(number + " is less than 10"); 
       number = number + 1;
    }
    
    /*
      initialize a starting point (variable)
      while (condition is true) { -> condition describes stopping point
        do something
        update
      }
    */
    
    //Goal #1: Write a loop that prints the numbers 1 through 10
    //1. initialization
    number = 1; //int number2 = 1
    //2. Condition
    while (number <= 10){
      //3. do something
      print(number + ", ");
      //4. update
      number = number + 1;
    }
    println(); //just goes down to the next line
    
    //Goal #2: Countdown, starting at 10, going to 1, and then say blastoff!
    int countDown = 10;
    while (countDown > 0){
       println(countDown);
       countDown = countDown - 1;
    }
    println("blastoff!");
    
    //Goal #3: Recreate these sequences with loops
      //100 95 90 85 80 ... 15 10 5
      //3, 6, 9, 12, 15, 18, 21
      //1, 2, 4, 8, 16, 32, 64
    
    int one = 100;
    while (one >= 5){
       print(one + ", ");
       one = one - 5; //one -= 5;
    }
    println();
    
    
    int two = 3;
    while (two <= 21){
       print(two + ", "); 
       two += 3; //two = two + 3
    }
    println();
    
    print("with ints: ");
    int threeA = 1;
    while (threeA <= 64){
       print(threeA + ", ");
       threeA *= 2; //threeA = threeA * 2;
    }
    println();
    print("with floats: ");
    int threeB = 0;
    while (pow(2, threeB) <= 64){ //threeB <= 6
       print(pow(2, threeB) + ", ");
       threeB++; //threeB += 1; //threeB = threeB + 1
    }
    
    
}
