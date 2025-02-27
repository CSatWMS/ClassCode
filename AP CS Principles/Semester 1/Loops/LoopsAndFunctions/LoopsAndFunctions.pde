void setup(){
  size(500, 500);
  puppy();
}
int x = 0;
void draw(){
  rect(x, 0, 50, 50);
  x = x + 1;
}

void puppy(){
  int yValue = 10;
  int blue = 0;
  while (yValue < height){
    fill(0, 0, blue);
    blue = blue + 10;
    drawRow(yValue);
    yValue = yValue + 20;
  }
}

void drawRow(int yValue){
    //init
    //while (condition) // stopping point
      //do something
      //update
   int size = 20;
   int xValue = 10;
   while (xValue < width){
     circle(xValue, yValue, size);
     xValue = xValue + size;
   }
}
