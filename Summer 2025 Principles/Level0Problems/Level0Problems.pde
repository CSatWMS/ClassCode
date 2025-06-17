void setup(){
  IntList testFL6 = new IntList(1, 2, 6);
  println(firstLast6(testFL6));
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

/*
Given an intList whose length is 3, 
return a new list with the elements 
"rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/

/*
Given an intList whose length is 3, 
return a new list with the elements in 
reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
*/
