void setup(){
  /*
  While loop steps
    1. initialize our variable(s)
    2. while (condition is true)
      3. do something
      4. change something / update
  */
  
  /*
    for loop general syntax:
    for (initialization ; condition ; update){
        do something
    }
  */
  
  //BAD UPDATES:
    //number + 1 (incomplete sentence)
    //number = number++; (too much going on)
    //number = number -= 4
  //GOOD UPDATES:
    //number = number + 1;
    //number += 1;
    //number++;
  
  //I want to count from 1 to 10, and print those numbers
  for (int number = 1 ; number <= 10 ; number = number + 1) {
    print(number + ", ");
  }
  println();
  //Make these with for loops:
  // 3, 6, 9, 12, 15
  for (int number = 3 ; number <= 15 ; number += 3){
     print(number + ", "); 
  }
  println();
  // 25, 21, 17, 13, 9, 5, 1
  for (int number = 25 ; number >= 1 ; number -= 4){
     print(number + ", "); 
  }
  println();
  // 2, 4, 8, 16, 32, 64, 128, 256
  for (int number = 2 ; number <= 256 ; number = number + number){
     print(number + ", "); 
  }
  println();
  
  
}
