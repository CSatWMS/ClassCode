void setup() {
  size(500, 500);

  //drawRectCol(20, 40, 60);
  //drawRectCol(400, 40, 80);
  fillWholeScreen(30, 60);
}

void fillWholeScreen(int w, int h){
  //init
  int x = 0;
  int horizCounter = 0;
  //while (condition)
  while (x < width){
    //do something (draw column?)
    drawRectCol(x, w, h, horizCounter);
    //update
    x += w;
    horizCounter++;
  }
}

void drawRectCol(int x, int w, int h, int startingColor) {
  int y = 0;
  int counter = startingColor;
  while (y < height) {
    /*if (counter % 2 == 1){
       fill(255, 255, 255); 
    } else {
       fill(0, 0, 0); 
    }*/
    
    if (counter % 3 == 0){
       fill(255, 0, 0); 
    } else if (counter % 3 == 1){
       fill( 0, 255, 0); 
    }else {
       fill(0, 0, 255); 
    }
    rect(x, y, w, h);
    y += h;
    counter++;
  }
}
