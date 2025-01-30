int x = 0;
int yBlink = 0;
boolean isGreen = true;

void setup(){
  size(400, 500);
  makeRow(10, 0);
  frameRate(10);
}

void draw(){
  int numSquares = 10;
  int dim = width / numSquares;
  int y = 0;
  while(y < height){
    makeRow(numSquares, y);
    y = y + dim;
  }
  if (isGreen){
    fill(0, 255, 0);
  } else {
    fill(0, 0, 255); 
  }
  isGreen = !isGreen;
  rect(x, yBlink, dim, dim);
  x = x + dim;
  //when it hits the end of the screen
  if (x >= width){
    //update y
    yBlink = yBlink + dim;
    x = 0;
    if (yBlink > height){
       x = 0;
       yBlink = 0;
    }
  }
  
    
}

void makeRow(int numSquares, int y){
  /*int x = 0;
  int y = 0;
  int dimension = width / numSquares;
  while (x < width){
    rect(x, y, dimension, dimension);
    x = x + dimension;
  }*/
  fill(255);
  int dimension = width / numSquares;
  //int y = 0;
  for (int i = 0; i < numSquares; i++){
    rect(i * dimension, y, dimension, dimension);
  }
  
}
