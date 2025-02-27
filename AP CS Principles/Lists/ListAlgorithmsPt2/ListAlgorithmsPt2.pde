/*
  Implement the sumOdd function, that should take in an IntList,
   and return the sum of only the odd values in the List.
   
  Create a test case in setup(), call your function, and verify
    your results.
    
  Example:
    list = [3, 2, 5, 4, 7, 1]
    int result = sumOdd(list);
      result -> 16

*/

void setup(){
   IntList list = new IntList();
   list.append(3);
   list.append(2);
   list.append(5);
   list.append(4);
   list.append(7);
   list.append(1);
   int result = sumOdd(list);
   println(result);
   println(containsValue(list, 7));
   println(containsValue(list, 8));
   println(containsAnyEven(list));
   
   IntList testGrades = new IntList();
   testGrades.append(75);
   testGrades.append(85);
   testGrades.append(95);
   testGrades.append(15);
   println("All grades are passing: " + allPassing(testGrades));
   println("Num passing grades: " + countPassing(testGrades));
}

int countPassing(IntList grades){
   int count = 0;
   for (int i = 0; i < grades.size(); i++){
      if (grades.get(i) >= 70){
          count++;
      }
   }
   return count;
}
boolean allPassing(IntList grades){
  //return true if all grades are above 70
  for (int i = 0; i < grades.size(); i++){
     if (grades.get(i) < 70){
        return false; 
     }
  }
  return true;
}

//containsONLYEvens
boolean containsONLYEvens(IntList list){
   for (int i = 0; i < list.size(); i++){
       if (list.get(i) % 2 == 1){
         return false;
       }
   }
   return true;
}

//containsAnyEven
  //return true, if my list contains any even number
boolean containsAnyEven(IntList list){
    for (int i = 0; i < list.size(); i++){
       if (list.get(i) % 2 == 0){
          return true; 
       }
    }
    return false;
}


//containsValue
  //list, value -> return true if that value is in the list
boolean containsValue(IntList list, int value){
   for (int i = 0; i < list.size(); i++){
      int number = list.get(i);
      if (number == value){
         return true; 
      } //else {
        // return false; 
      //}
   } //ends the loop
   return false;
}  

int sumOdd(IntList list){
  int basket = 0;
  for (int i = 0; i < list.size(); i++){
     if (list.get(i) % 2 == 1){
       basket += list.get(i);
     }
  }
  return basket;
}  
