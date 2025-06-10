void setup(){
   size(600, 600);
   /*
   rect(0, 0, 100, 100);
   rect(100, 0, 100, 100);
   rect(200, 0, 100, 100);
   */
   
   int numSquares = (int) random(10, 50);
   int squareWidth = width / numSquares;
   int xVal = 0;
   while (xVal < width){
      rect(xVal, 0, squareWidth, squareWidth);
      xVal = xVal + squareWidth;
   }
   
   drawColumn(width / 2, 10);
   drawMajorDiagonal(10, 2);
   blueScreen();
}

void drawColumn(int x, int numOfShapes){
  int circDiam = height / numOfShapes;
  int y = circDiam/2;
  while (y < height){
     circle(x, y, circDiam);
     y += circDiam;
  }
}

void drawMajorDiagonal(float initSize, float factor){
  //init  (x and y)
  float x = initSize/2;
  float y = initSize/2;
  //while (condition)
  while (x < width && y < height){
    //do something
    circle(x, y, initSize);
    //update (initSize) (x and y)
    float newSize = initSize * factor;
    x += (initSize/2 + newSize/2); //x = x + initSize;
    y += (initSize/2 + newSize/2);
    initSize = newSize;
  }
}


void blueScreen(){
  noStroke();
    //GOAL: black on the right, and as we move left, I want to get MORE blue
    int rectWidth = width / 256;
    int xVal = width - rectWidth;
    int blueValue = 0;
    while(xVal >= 0){
       fill(0, 0, blueValue);
       rect(xVal, 0, rectWidth, height);
       xVal -= rectWidth;
       blueValue += 1;
    }
}
