/*void setup(){
  println(add(3, 5));
  if (5 > 3){
    println(add(3, 5));
  } else {
    println(add(3, 5));
  }
  
  
}

void draw(){
  println(add(2,7));
}

int add(int a, int b){
 return a + b; 
}*/


void setup(){
  int number = 5;
  while (number <= 10){
     println(number + " is less than 10"); 
     number = number + 1;
  }
  
  int count5s = 0;
  while (count5s <= 100){
     println(count5s);
     count5s = count5s + 5;
  }
  
  //initialization (starting point)
  //while (condition) //runs while it's true
      //do something
      //update
      
      
  //make a countdown
  //10 -> 1
  int countdown = 10;
  while (countdown >= 1){  //countdown > 0 , 0 < countdown, 1 <= countdown
    println(countdown);
    countdown = countdown - 1; //countdown--;
  }
  
  size(500, 500);
  int x = 25;
  int redPigment = 255;
  while (x < width){
    fill(redPigment, 0, 0);
     circle(x, height / 2, 50);
     x = x + 50;
     int numCircles = width / 50;
     int redChange = 255 / numCircles;
     redPigment = redPigment - redChange;
  }
  
  int y = 0;
  int blue = 0;
  while (y < height){
    fill(0, 0, blue);
     rect(width / 2, y, 30, 30);
     y = y + 30;
     int numSquares = height / 30;
     int blueChange = 255 / numSquares;
     blue = blue + blueChange;
  }
  
  
  int xgreen = 25;
  int ygreen = 25;
  int green = 255;
  while (xgreen < width && ygreen < height){
    fill(0, green, 0);
     circle(xgreen, ygreen, 50);
     xgreen += 50;
     ygreen += 50;
     green -= 255 / 10;
  }
  
}
