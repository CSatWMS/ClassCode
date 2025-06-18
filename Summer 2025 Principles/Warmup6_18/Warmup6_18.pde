void setup(){
  IntList numbers = generateRandom(10);
  println(numbers);
  println("Sum of Pos: " + sumPositive(numbers));
  println("Largest Negative: " + biggestNegative(numbers));
}

IntList generateRandom(int n){
   IntList toReturn = new IntList();
   for (int fish = 0; fish < n; fish++){
     toReturn.append((int) random(-50, 50));
   }  
   return toReturn;
}





int sumPositive(IntList list){
   int sum = 0;
   for (int i = 0; i < list.size(); i++){
      if (list.get(i) > 0){
         sum += list.get(i); 
      }
   }
   return sum;
}

int biggestNegative(IntList list){
   //vs 0;  //would need to add max >= 0 || 
   //vs -50;  //just works
   //vs Integer.MIN_VALUE //just works
   //vs list.get(0); //would need to add max > 0 ||
   int max = -50;
   for (int i =0; i < list.size(); i++){
      if ((list.get(i) < 0 && list.get(i) > max)){
         max = list.get(i); 
      }
   }
   return max;
}

//GOAL: is to count the number of even values in the list
  //[3, 6, 2, 9, 8]
    
int countEvens(IntList list){
   int puppy = 0;
   for (int cat = 0; cat < list.size(); cat++){
       int currNumber = list.get(cat);
       if (currNumber % 2 == 0){
          puppy++; 
       }
   }
   return puppy;
}
