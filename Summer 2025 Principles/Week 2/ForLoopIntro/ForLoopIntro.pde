void setup(){
   //initialize
   //while (condition)
     //do something
     //update
     
  //for (initialization ; condition ; update) {
      //do something
  //}
  
  //GOAL #1: Count from 1 to 10
  for (int num = 1; num <= 10; num = num + 1){
    print(num + ", ");
  }
  println();
  
  //when do I use a for loop vs a while loop?
    //anything i can do with a for loop, i can do with a while
    //for loops excel with concrete starting and ending points
      //(while loop CAN do this)
    //while loops excel when you don't know how many times something will happen
      //when we use the word "until"
  
  
  //Goal #2: Countdown from 10 to 1, and then blastoff!
  for (int num = 10; num > 0; num--){
    println(num);
  }
  println("Blastoff!");
  
//1, 3, 5, 7, 9
for (int a = 1; a < 10; a += 2){ //executes 5 times
   print(a + ", "); 
}
println();
//20, 16, 12, 8, 4, 0
for (int b = 20; b >= 0; b--){ //executes 21 times
  if (b % 4 == 0){
    print(b + ", "); //executes 6 times
  }
}
println();
//81, 27, 9, 3, 1
//votes for 81 and 5
for (int c = 81; c > 0; c /= 3){ 
  //executes infinite times with >=
  //executes 5 times with >
  print(c + ", ");
}
println();
  
size(400, 400);
int numSquares = 10;
drawRow(0, numSquares);

for (int y = 0; y < height; y += height / numSquares){
  drawRow(y, numSquares);
}


  
}

//GOAL: takes in a y value, and a number of squares
  //draw a row of that many squares at that y value
  //do it with a for loop
void drawRow(int y, int numSquares){
    int squareSize = width / numSquares;
    /*
    for (int x = 0; x < width; x += squareSize){
       rect(x, y, squareSize, squareSize); 
    }
    */
    for (int num = 0; num < numSquares; num++){
       int xVal = num * squareSize;
       if (num % 3 == 0){
          fill(255, 0, 0); 
       } else if (num % 3 == 1){
          fill(0, 255, 0); 
       } else if (num %3 == 2){
          fill(0, 0, 255); 
       }
       rect(xVal, y, squareSize, squareSize);
    }
}
