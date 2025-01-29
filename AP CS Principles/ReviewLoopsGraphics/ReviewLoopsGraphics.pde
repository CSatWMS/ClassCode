int x = 0;
int y = 0;

void setup(){
  size(400, 500);
  makeRow(10);
}

void draw(){
  int numSquares = 10;
  int dim = width / numSquares;
  fill(0, 255, 0);
  rect(x, y, dim, dim);
}

void makeRow(int numSquares){
  /*int x = 0;
  int y = 0;
  int dimension = width / numSquares;
  while (x < width){
    rect(x, y, dimension, dimension);
    x = x + dimension;
  }*/
  int dimension = width / numSquares;
  int y = 0;
  for (int i = 0; i < numSquares; i++){
    rect(i * dimension, y, dimension, dimension);
  }
  
}
