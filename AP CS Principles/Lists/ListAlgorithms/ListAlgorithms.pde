/*Implement the following 2 functions, create test cases in setup(),
  and call both functions within setup() to verify that they work
  
  Function 1: printNegatives
    This function should take in an IntList and print out negative values
    
  Function 2: locateNegatives
    This function should take in an IntList and *return* an IntList
      containing the locations of any negative number
      
  [-2, 3, -5, 9, 1, -7]
     printNegatives(list) -> -2, -5, -7
     
     IntList locations = locateNegatives(list)
       locations -> 0, 2, 5
*/
void setup(){
   IntList toTest = new IntList();
   toTest.append(-2);
   toTest.append(3);
   toTest.append(-5);
   toTest.append(9);
   toTest.append(1);
   toTest.append(-7);
   printNegatives(toTest);
   IntList locations = locateNegatives(toTest);
   println(locations);
   
   for (int i = 0; i < locations.size(); i++){
     int index = locations.get(i);
     println(toTest.get(index));
   } 
   
   IntList example = new IntList();
   example.append(7);
   example.append(5);
   example.append(1);
   example.append(3);
   example.append(8);
   println("The sum is: " + sumUp(example));
   println("The average is: " + averageNum(example));
   println("The max is: " + findMaximum(example));
}

int findMaximum(IntList list){
    int max = list.get(0); //DONT want to use 0
    for (int i = 1; i < list.size(); i++){
        int currNum = list.get(i);
        if (currNum > max){
           max = currNum;
        }
    }
    return max;
}

int averageNum(IntList list){
   int total = sumUp(list);
   int avg = total / list.size();
   return avg;
}

//GOAL: return the sum of a list
int sumUp(IntList list){
   int basket = 0;
   for (int i = 0; i < list.size(); i++){
      int currNum = list.get(i);
      basket = basket + currNum; //basket += currNum;
   }
   return basket;
}

IntList locateNegatives(IntList list){
   IntList toReturn  = new IntList();
   for (int i = 0; i < list.size(); i++){
      int currNum = list.get(i);
      if (currNum < 0){
         toReturn.append(i); 
      }
   }
   return toReturn;
}



void printNegatives(IntList list){
   for (int index = 0; index < list.size() ; index++){
      int currNum = list.get(index);
      if (currNum < 0){
         println(currNum); 
      }
   }
}
