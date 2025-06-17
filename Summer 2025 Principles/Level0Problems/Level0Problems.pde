void setup(){
  IntList testFL6 = new IntList(1, 2, 6);
  println(firstLast6(testFL6));
  //commonEnd([1, 2, 3], [7, 3]) → true
  IntList cE_A = new IntList(1, 2, 4);
  IntList cE_B = new IntList();
  cE_B.append(7);
  cE_B.append(3);
  println(commonEnd(cE_A, cE_B));
  
  println(rotateLeft3( new IntList(5, 11, 9)));
  
  IntList toReverse = new IntList(5, 11, 9);
  println(toReverse);
  println(reverse3(toReverse));
}

boolean firstLast6(IntList list){
  if (list.get(0) == 6 || list.get(list.size() - 1) == 6){
     return true; 
  } else {
     return false; 
  }
}

/*
Given 2 intLists, a and b, return true if they have the 
same first element or they have the same last element. 
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
*/
boolean commonEnd(IntList a, IntList b){
   int firstA = a.get(0);
   int firstB = b.get(0);
   if (firstA == firstB || a.get(a.size() - 1) == b.get(b.size() - 1)){
      return true; 
   } else {
      return false; 
   }
}


/*
Given an intList whose length is 3, 
return a new list with the elements 
"rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) →  [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9]  →  [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/
//combos of remove and append
//combos of get and set
IntList rotateLeft3(IntList list){
  int first = list.remove(0);
  list.append(first);
  return list;
}

/*
Given an intList whose length is 3, 
return a new list with the elements in 
reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
*/

IntList reverse3(IntList list){
   //approach 1: get F, M, L. Append to a new list like L, M, F
   //approach 2: use set to update values
     //SWAP: first and last
     //SWAPs always use 3 lines of code
   int saved = list.get(0);
   list.set(0, list.get(2));
   list.set(2, saved);
   return list;
}
