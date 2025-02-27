void setup(){
  int favoriteNumber = 11;
  printDataOut(favoriteNumber);
  println(isEven(favoriteNumber));
  println(isEven(12));
  
  //for (initialization ; condition ; update)
  for (int babyFav = favoriteNumber - 5; babyFav <= favoriteNumber + 5; babyFav++){
    printDataOut(babyFav);
  }
  
  printSequence(5, 10);
  printSequence(10, 5);
}

//GOAL: printSequence
  //two params: start and stop
    //printSequence(5, 10)
        //5, 6, 7, 8, 9, 10
    //printSequence(10, 5)
        //10, 9, 8, 7, 6, 5
void printSequence(int start, int stop){
  if (start < stop){
     //count up 
     for (int mover = start ; mover <= stop ; mover++){
       print(mover + ", ");
     }
  } else {
     //count down 
     for (int mover = start ; mover >= stop ; mover--){
         print(mover + ", ");
     }
  }
  println();
}


//GOAL: isEven
  //return true if the number is even, false if its odd
  //1 parameter, the number
boolean isEven(int puppy){
  if (puppy % 2 == 0){
     return true; 
  } else {
     return false; 
  }
}

void printDataOut(int num){
  println("My favorite number is: " + num); 
  if (isEven(num)/* == true*/){
    println("And it's even!");
  } else{
     println("And it's odd!"); 
  }
}

void draw(){
  
}
