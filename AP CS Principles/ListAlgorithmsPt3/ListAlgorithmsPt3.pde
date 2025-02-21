/*
Write a function, countTarget, that takes in an IntList and an int target.
  The function should count how many times the target number appears in
  the list, and then return that number. In setup, write code that would
  test your function using one or more of the examples below.
  
  Examples:
    countTarget([4, 5, 2, 8, 4, 8, 4] , 4) -> 3
    countTarget([4, 5, 2, 8, 4, 8, 4] , 2) -> 1
    countTarget([4, 5, 2, 8, 4, 8, 4] , 7) -> 0

*/

void setup(){
   IntList list = new IntList();
   list.append(4);
   list.append(4);
   list.append(8);
   list.append(8);
   list.append(4);
   list.append(8);
   list.append(8);
   println(countTarget(list, 4));
   println(countTarget(list, 2));
   println(countTarget(list, 7));
   println(countAdjDups(list));
   
}

int countTarget(IntList list, int target){
  int count = 0;
  for (int i = 0; i < list.size(); i++){
    if (list.get(i) == target){
      count++;
    }
  }
  return count;
}

//counting adjacent duplicates
int countAdjDups(IntList list){
   int count = 0;
   for (int i = 0; i < list.size() - 1; i++){
       int currNumber = list.get(i);
       int neighbor = list.get(i + 1);
       if (currNumber == neighbor){
          count++; 
       }
   }
   return count;
}

void printIfNextEven(IntList list){
    // [2, 3, 8, 5, 4]
    //  -> 3, 5
    for (int i = 0; i < list.size() - 1; i++){
       int currNumber = list.get(i);
       int neighbor = list.get(i + 1);
       if (neighbor % 2 == 0){
          println(currNumber); 
       }
    }
}
