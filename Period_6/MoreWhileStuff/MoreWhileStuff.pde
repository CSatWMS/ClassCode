void setup() {
  size(500, 500);
  //drawRectCol(20, 50, 20);
  //drawRectCol(20, 20, 50);
  fillWholeScreen(20, 50);
}

void fillWholeScreen(int w, int h){
  int x = 0;
  
}

void drawRectCol(int x, int w, int h) {
  int y = 0;
  while (y < height) {
    rect(x, y, w, h);
    y += h;
  }
}
