void setup(){
   //IntList (FloatList and StringList too)
   IntList nums = new IntList();
   nums.append(8);
   nums.append(7);
   nums.append(12);
   nums.append(3);
   nums.append(2);
   println(nums);
   println(nums.get(nums.size() - 1));
   nums.set(1, 101);
   println(nums);
   nums.remove(0);
   println(nums);
   
   //GOAL: print out every number on its own line
   println(nums.get(0));
   println(nums.get(1));
   println(nums.get(2));
   println(nums.get(3));
   for (int i = 0; i < nums.size(); i++){
      println(nums.get(i)); 
   }
   
   printSquares(nums);
   println("-----");
   printEvens(nums);
   println("-----");
   printLocation(nums, 12);// -> 1
   printLocation(nums, 101);// -> 0
   println("-----");
   printAboveThreshold(nums, 4); // -> 101, 12
}

void printAboveThreshold(IntList list, int threshold){
  for (int i = 0; i < list.size(); i++){
      int number = list.get(i);
      if ( number > threshold){
         println(number); 
      }
  }
}

void printLocation(IntList list, int number){
  for (int i = 0; i < list.size(); i++){
      int currValue = list.get(i);
      if (currValue == number){
        println(i);
      }
  }
}

void printEvens(IntList list){
    //only print the number if it's even
    for (int i = 0; i < list.size(); i++){
      if (list.get(i) % 2 == 0){
         println(list.get(i)); 
      }
    }
}

void printSquares(IntList list){
    //square = num * num
    for (int index = 0; index < list.size(); index++){
        int num = list.get(index);
        int square = num * num;
        println(square);
    }
}
