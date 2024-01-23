void setup(){
  String result1 = letterType('e');
  println(result1);
  
  println(letterType('X'));
  
  
  int numberGrade = 87;
  if (numberGrade >= 90){
     println("A"); 
  }
  if (numberGrade >= 80 && numberGrade < 90){
     println("B"); 
  }
  if (numberGrade >= 70 && numberGrade < 80){
     println("C"); 
  }
  
  
  getLetterGrade(87);
  
  int windspeed = 122;
  
  
  
}

void getLetterGrade(int numberGrade){
  if (numberGrade >= 90){
     println("A"); 
  } else if (numberGrade >= 80){
     println("B"); 
  } else if (numberGrade >= 70){
     println("C"); 
  } else {
     println("F"); 
  }
}

//consider:
  //"small" -> 2 or less digits
  //"big" -> 6 or more digits
  //"neither" -> 3 to 5 digits
String numberType(int number){
    number = abs(number); //takes care of negatives!
    if (number <= 99){
      return "small";
    } else if (number >= 100000){
       return "big"; 
    } else {
       return "neither"; 
    }
}
      

String letterType(char letter){
  if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
      return "vowel";
  } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
      return "vowel";
  } else {
     return "consonant"; 
  }
  
}
