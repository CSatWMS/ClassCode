void setup(){
  println(labelNumber(9));
  println(labelNumber(-2));
  println(labelNumber(0));
}

void draw(){
  /*
    if (mouseX > width / 2){
      background(255);
    } else{
      background(0); 
    }
  */
  
  //red quandrant
  if (mouseX < width / 2 && mouseY < height / 2){
    
  }
  
}

//GOAL: Determine if a number is positive or negative
String labelNumber(int number){
   if (number > 0){
      return "Positive"; 
   } else if (number == 0) {
      return "ZERO"; 
   } else {
      return "Negative"; 
   }
}

String category(int wind){
   if (wind < 74){
      return "Not a hurricane"; 
   } else if (wind < 96){
      return "1"; 
   } else if (wind < 111){
      return "2"; 
   } else if (wind < 130){
      return "3"; 
   } else if (wind < 157){
      return "4"; 
   } else {
      return "5"; 
   }
}
