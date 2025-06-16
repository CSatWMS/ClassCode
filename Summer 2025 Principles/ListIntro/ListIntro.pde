void setup(){
  //lists are a way to store multiple values in one variable
    //data structure -> a thing that holds data
    
  //IntList , FloatList, StringList
  
  IntList numbers = new IntList(7, 3, 5, 1);
  println(numbers);
  //element = a value at an index in a list
  //index -> the location of a value/element
  int numberOfElements = numbers.size();
  println(numberOfElements);
  //.get(index) -> returns the value at that index
  int first = numbers.get(0);
  println(first);
  int last = numbers.get(numbers.size() - 1);
  println(last);
  
  //.set(index, newValue) -> updates that index to have the new value
  numbers.set(1, 64);
  println(numbers); //size does not change
  
  //.remove(index) -> removes the value at that index
    //return what WAS there
    //change the size (reduce by 1)
      //indexes of later values, change
  println("Kill the seven");
  int removedNumber = numbers.remove(0);
  println(numbers);
  println(removedNumber);
  
  //.append(value) -> it glues that value to the end of the list
    //the size changes (increases by 1 each time)
  numbers.append(8);
  numbers.append(9);
  numbers.append(12);
  println(numbers);
  
  //GOAL: is to print out each element on its own line
  for (int index = 0; index < numbers.size(); index++){
     int curr = numbers.get(index);
     println(curr); 
  }
  
  //GOAL: Print out list backwards
  for (int index = numbers.size() - 1 ; index >= 0 ; index--){
    int curr = numbers.get(index);
    print(curr + ", ");
  }
  println();
  
  //GOAL: I only want to print out ODD values (going fowards)
  for (int index = 0; index < numbers.size(); index++){
     int curr = numbers.get(index);
     if (curr % 2 != 0) {
       print(curr + ", ");
     }  
  }
  println();
  
  //GOAL: Update each element, to its square
    //[1, 2, 4] -> [1, 4, 16]
  for (int i = 0; i < numbers.size(); i++){
      int curr = numbers.get(i);
      int square = curr * curr;
      numbers.set(i, square); //.set(index, newValue)
  }
  println(numbers);
  
  
  //GOAL: Initialize a list with 100 random values
  int listSize = 100;
  IntList randomNumbers = new IntList();
  for (int count = 0; count < listSize; count++){
    randomNumbers.append( (int) random(-100, 100));
  }
  println(randomNumbers);
  
}
