void setup(){
  
  int number = 3;
  while (number < 10){
     println(number + " hooray!"); 
     number = number + 1;
  }
  
  println("FINAL: " + number);
  
  //write a loop that counts from 0 to 100 in steps of 5
  int numsBy5 = 0;
  while (numsBy5 <= 100){
     println(numsBy5);
     numsBy5 = numsBy5 + 5;
  }
  
  //Can YOU count from -100 to 0 in steps of 10
  //-100 -90 -80 -70, etc
  int numsBy10 = -100;
  while (numsBy10 <= 0) {
     println(numsBy10);
     numsBy10 = numsBy10 + 10;
  }
  
  //required pieces of a while loop
  
  //initialize a variable (the starting point)
  // while (condition) -> condition is like the stopping point
    //print something (or otherwise do something)
    //update the variable (add maybe?)
    
  //Code a COUNTDOWN Sequence to BLASTOFF!
  //start at 10, and countdown to 1, then say blastoff!
  
  int countdown = 10;
  while (countdown > 0){
     println(countdown);
     countdown = countdown - 1;
  }
  println("BLASTOFF!!");
  
  int[] arr = {7, 5, 1, 3};
  int index = 0;
  while (index < arr.length){
     println(index + ", " + arr[index]);
     index = index + 1; 
  }
  
  
  
}
