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
  //25, 21, 17, 13, 9, 5, 1
  //1, 2, 4, 8, 16, 32, 64
  
  
}
