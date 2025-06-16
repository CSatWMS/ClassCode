void setup(){
  IntList testFL6 = new IntList(1, 2, 6);
  println(firstLast6(testFL6));
}

boolean firstLast6(IntList list){
  if (list.get(0) == 6){
     return true; 
  } else {
     return false; 
  }
}
