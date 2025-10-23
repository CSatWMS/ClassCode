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
  
  
}
