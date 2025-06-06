void setup(){
   int numberGrade = 85;
   //write an if statement that will print the letter grade
       //90+ A
       //80-89 B
       //70-79 C
       //<70 F
   if (numberGrade >= 90){
      println("A"); 
   }
   if (numberGrade >= 80 && numberGrade <= 89){
      println("B"); 
   }
   if (numberGrade >= 70 && numberGrade < 80){
      println("C"); 
   }
   if (numberGrade < 70){
      println("F"); 
   } else {
      println("double failing"); 
   }
   
   println("-------------");
   
   if (numberGrade > 90){
      println("A"); 
   } else if (numberGrade > 80){
      println("B"); 
   } else if (numberGrade > 70){
      println("C"); 
   } else if (numberGrade < 70){
      println("F"); 
   } else {
      println("double failing"); 
   }
}
