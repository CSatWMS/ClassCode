void setup(){
    println(banana(1, 2, 3));
    println(banana(1, 2, 2));
    println(banana(2, 2, 2));
  
}

//GOAL: Given a day number, 1->7
  //return if it's a weekend, a weekday, or an invalid number
String dayType(int dayNumber){
    if (dayNumber == 1 || dayNumber == 7){
       return "Weekend";
    } else if (dayNumber >= 2 && dayNumber <= 6){
       return "Weekday"; 
    } else {
       return "Invalid"; 
    }
}

//GOAL: Take in three numbers
  //determine the largest number
int findLargest(int a, int b, int c){
  if (a > b && c < a){
     return a; 
  } else if (b > a && b > c){
    return b; 
  } else if (c > a && c > b){
     return c; 
  } else {
     return -1; 
  }
}

//GOAL: Take in three numbers
  //Tell me if there are all increasing (1, 5, 8)
  //All decreasing (10, 5, 1);
  //Or if their Varied (4, 7, 2);
String upOrDown(int a, int b, int c){
    if (a > b && b > c){
      return "decreasing";
    } else if (a < b && b < c) {
      return "increasing";
    } else {
      return "varied";
    }
}


//GOAL: take in three numbers, 
  //I want to know: are they all the same (2, 2, 2), 
  // or are they all different? (1, 2, 3)
  //or a mixture -> 2, 2, 3
String banana(int a, int b, int c){
   if (a == b && b == c /* && a == c*/){
     return "SameSame";
   } else if (a != b && b != c && a != c){
     return "All Different";
   } else {
     return "Mixture";
   }
}
