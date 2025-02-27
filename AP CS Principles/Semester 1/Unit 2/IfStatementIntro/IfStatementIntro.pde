void setup(){
  int x = 15;
  int y = 20;
  println(x);
  println(y);
  
  boolean first = true;
  boolean second = false;
  //relational operator
    /*
    > greater than
    < less than
    >= greater than or equal to
    <= less than or equal to
    == "equals equals" -> are we the same?
    != "not equals" -> are we different?
    */
  boolean third = 2 > 5; //false
  boolean fourth = 2 > 2; //false
  boolean fifth = 2 >= 2; //true
  boolean sixth = 2 == 2; //true
  boolean seven = 2 != 2; //false
  boolean eighth = 2 != 3; //true
  
  
  /*
  if statement syntax
  if (boolean condition is true){
     do something 
  } else {
     this happens when the condition is false 
     do something else
  }
  */
  
  int age = 16;
  if (age >= 15){
     println("I can drive!"); 
  } else {
     println("I need a ride!"); 
  }
  
  if (age >= 18){
     println("I can vote"); 
  } else {
     println("I'm a minor, but I can volunteer!"); 
  }
  
  if (age <= 12  && age > 2){
      println("I can bounce in the castle");
  } else {
     println("You can't jump."); 
  }
  
  if (age < 5 || age > 70){
      println("I need a nap!");
  }
  
} //closes setup
