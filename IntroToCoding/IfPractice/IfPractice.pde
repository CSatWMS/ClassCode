void setup(){
  int biggest = biggerNumber(2, 4);
  println(biggest);
  
  println(evenBiggerNumber(1, 2, 3));
  println(evenBiggerNumber(3, 2, 1));
  println(upOrDown(20,15,17));
  println(sameSame(2, 2, 2)); //same
  println(sameSame(2, 3, 4)); //different
  println(sameSame(2, 2, 4)); //between
  
}

String test(int a, int b){
   if (a >= b){
      return "hello"; 
   } else if (a < b){
      return "goodbye"; 
   } else {
      return "pizza"; //never get pizza... 
   }
}

//GOAL: give a number, return the number of days in that month  
  //if it's not a number 1-12, return -1
int daysInMonth(int month){
    return -1;
}

//GOAL: given a number, return the day of the week
  //Monday -> 1
  //Tuesday -> 2
  //...
  //Sunday -> 7
  //unknown day
String dayOfWeek(int number){
    if (number == 1){
       return "Monday"; 
    } else if (number == 2){
       return "Tuesday"; 
    }else if (number == 3){
       return "Wednesday"; 
    }else if (number == 4){
       return "Thursday"; 
    }else if (number == 5){
       return "Friday"; 
    }else if (number == 6){
       return "Saturday"; 
    }else if (number == 7){
       return "Sunday"; 
    } else {
       return "unknown day"; 
    }
}
  

//GOAL: given 3 numbers, determine if they are all the "same"
    //or all "different" or in "between"
String sameSame(int a, int b, int c){
  if (a == b && b == c){
     return "same"; 
  } 
  //way 1: between first
  else if (a == b || b ==c || a == c){
    return "between";
  }
  //way 2: different first
  else if (a != b && a != c && b != c){
     return "different"; 
  } else {
     return "This should never happen"; 
  }

  
}


//GOAL: given 3 numbers, determine they are "Increasing", "Decreasing" or "Neither"
String upOrDown(int a, int b, int c){
  if (a>b && b>c){
    return "decreasing";
  } else if (a<b && b<c){
    return "increasing";
  } else{
    return "neither";
  }
}

//GOAL: write a function that takes three number, and finds the biggest  
  //assume all numbers are unique
int evenBiggerNumber(int a, int b, int c){
    //a is the biggest
    if (a > b && a > c){
       return a; 
    } else if (b > a && b > c){
       return b;
    } else {
       return c; 
    }
}


//returnType functionName(parameters)

//GOAL: determine the bigger number
int biggerNumber(int x, int y){
   if (x > y){
      return x; 
   } else {
      return y; 
   }
}
