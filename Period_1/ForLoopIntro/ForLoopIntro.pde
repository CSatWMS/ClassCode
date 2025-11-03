void setup(){
   /*
   while loop steps
   1. Initialize
   2. while (condition is true)
     3. do something
     4. update
   */
   
   /*
   for loop general syntax
   for ( inititialize ; condition ; update ){
     do something
   }
   */
   
   //BAD UPDATES
     //number + 1 (incomplete sentence)
     //number = number += 1 (too much going on)
     //number = number++ (too much)
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
   for (int num = 3 ; num <= 15 ; num = num + 3){
      print(num + ", "); 
   }
   println();
   //25, 21, 17, 13, 9, 5, 1
   for (int num = 25 ; num >= 1 ; num -= 4){
      print(num + ", "); 
   }
   println();
   //2, 4, 8, 16, 32, 64, 128, 256
   for (int number = 2 ; number <= 256 ; number *= 2){
      print(number + ", "); 
   }
   println();
   
}
