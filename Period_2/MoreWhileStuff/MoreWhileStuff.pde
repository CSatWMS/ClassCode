void setup(){
  size(500, 500);
  //drawRectCol(0, 20, 40);
  //drawRectCol(20, 20, 40);
  //drawRectCol(40, 20, 40);
  fillWholeScreen(20, 40);
}

void fillWholeScreen(int w, int h){
  //init
  int x = 0;
  //while (cond)
  while (x < width){
    //do something (draw the column)
    drawRectCol(x, w, h);
    //udpate
    x += w;
  }
}

//GOAL: Draw a column of rectangles
void drawRectCol(int x, int w, int h){
  //init
  int y = 0;
  //while(cond) -> while we're still on the screen
  while (y < height){
    //do something -> draw the rectangle
    rect(x, y, w, h);
    //update -> move rectangle down (y increases)
    y += h;
  }
}
