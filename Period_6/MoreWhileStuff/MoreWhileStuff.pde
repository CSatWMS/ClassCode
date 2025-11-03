void setup() {
  size(500, 500);
  //drawRectCol(20, 50, 20);
  //drawRectCol(20, 20, 50);
  fillWholeScreen(20, 50);
}

void fillWholeScreen(int w, int h){
  int x = 0;
  int otherColorCounter = 0;
  while (x < width){
     drawRectCol(x, w, h, otherColorCounter);
     x += w;
     otherColorCounter++;
  }
}
void drawRectCol(int x, int w, int h, int startingColor) {
  int y = 0;
  int colorCounter = startingColor;
  while (y < height) {
    if (colorCounter % 2 == 0){
      //even is white
       fill(255, 255, 255); 
    } else {
      //odd is black
       fill(0, 0, 0); 
    }
    rect(x, y, w, h);
    y += h;
    colorCounter++;
  }
}
