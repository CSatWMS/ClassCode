void setup(){
   /*
   while loop steps:
     1. initialize
     2. while (condition)
       3. do something
       4. update
   */
   
   /*
   for loop general syntax
   for (initialization ; condition ; update){
      do something 
   }
   */
   
   //BAD UPDATES
     //number + 1 (incomplete sentence)
     //number = number += 1 (TOO MUCH going on)
     //number = number++ (also too much)
   //GOOD UPDATES
     //number = number + 1
     //number += 1
     //number++
   
   //i want to count from 1 to 10
   for (int number = 1 ; number <= 10 ; number = number + 1){
     print(number + ", ");
   }
   println();
   
   //3, 6, 9, 12, 15
   //25, 21, 17, 13, 9, 5, 1
   //2, 4, 8, 16, 32, 64, 128, 256
   
}
