void setup(){
 IntList list1 = new IntList();
 list1.append(1);
 list1.append(3);
 list1.append(1);
 list1.append(3);
 
 IntList list2 = new IntList();
 list2.append(1);
 list2.append(4);
 list2.append(1);
 list2.append(1);
 list2.append(4);
 
 println(isEverywhere(list1, 1));
 println(more14(list2));
}

/*
We'll say that a value is "everywhere" in a list if for every 
pair of adjacent elements in the list, at least one of the pair 
is that value. Return true if the given value is everywhere in the list.

Examples:
  isEverywhere([1, 2, 1, 3], 1) → true
  isEverywhere([1, 2, 1, 3], 2) → false
  isEverywhere([1, 2, 1, 3, 4], 1) → false

*/
boolean isEverywhere(IntList list, int value){
    for (int i = 1; i < list.size(); i++){
        int first = list.get(i - 1);
        int second = list.get(i);
        if (first != value && second != value){
           return false; 
        }
    }
    return true;
}


/*

Given an IntList, return true if the number of 1's 
  is greater than the number of 4's

Examples:
  more14([1, 4, 1]) → true
  more14([1, 4, 1, 4]) → false
  more14([1, 1]) → true

*/
boolean more14(IntList list){
   int count1 = 0;
   int count4 = 0;
   for (int i = 0; i < list.size(); i++){
      if (list.get(i) == 1){
         count1++; 
      }
      if (list.get(i) == 4){
         count4++; 
      }
   }
   if (count1 > count4){
      return true; 
   } else {
      return false; 
   }
}
