void setup(){
  int days = daysInMonth(3);
  println(days);
  
  println(daysInMonth(9));
  
  println(dateIsBefore(6, 3, 9, 20));
  println(dateIsBefore(10, 1, 2, 25));
  println(dateIsBefore(8, 15, 8, 15));
  println(dateIsBefore(8, 15, 8, 16));
}

//function header??
// returnType funcName(parameters)
    //parameters: dataType varName, dataType2 varName2, dataType3 varName3
//function body -> solve the problem, return statement

//Given a month, represented by its number, 
//determine how many days are in that month.
int daysInMonth(int month){
    if (month == 1 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
       return 31; 
    } else if (month == 2){
       return 28; 
    } else if (month == 3){
       return 31; 
    } else if (month == 4 || month == 6 || month == 9 || month == 11){
       return 30; 
    } else {
       return -1; 
    }
}

//Given 2 dates, (month1, day1, month2, day2) 
//determine whether or not the first date is BEFORE the second date.

boolean dateIsBefore(int month1, int day1, int month2, int day2){
  if (month1 < month2){
     return true; 
  } else if (month2 < month1){
     return false; 
  } else {
    //here the months HAVE to be the same
    if (day1 < day2){
       return true; 
    } else {
       return false; 
    }
  }
}
