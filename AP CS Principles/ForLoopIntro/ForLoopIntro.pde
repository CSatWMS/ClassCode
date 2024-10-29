/* WHILE loop
  initialize
  while(condition){
    do something
    update
  }
*/

/* FOR loops
  for (initialization ; condition ; update){
    do stuff
  }

*/

void setup(){
  //GOAL: is to count to 10
  for (int number = 1; number <= 10; number = number + 1){
    println(number);
  }
  
  //count from 0 to 100 by 5's
  for (int number = 0; number <= 100; number += 5){
     print(number + ", "); 
  }
  println(); 
  println("hello");
  
  // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 -> BLASTOFF
  for (int x = 10; x > 0; x--){
     print(x); 
  }
  println("-> Blastoff!");
  // 1, 2, 4, 8, 16, 32, 64
  for (int power = 1; power < 100; power *= 2){
     print(power + ", "); 
  }
  println();
  // 3, 6, 9, 12, 15, 18, 21
  for (int i = 3; i <= 21; i += 3){
     print(i + ", "); 
  }
  println();
  
  
  
  
  
  
  
  
  
  
  
  
}
