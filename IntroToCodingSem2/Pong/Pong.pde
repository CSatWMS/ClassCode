int bluePoints = 0;
int redPoints = 0;

void setup(){
  size(800, 500);
}

void draw(){
   drawScreen();
}

void drawScreen(){
    background(0, 0, 0);
    strokeWeight(4);
    stroke(255, 255, 30);
   int lineLength = 10;
   int y1 = 0;
   int x = width / 2;
   while (y1 < height){
      int y2 = y1 + lineLength;
      line(x, y1, x, y2);
      y1 = y1 + lineLength * 2;
   }
   textSize(50);
   fill(255, 0, 0);
   text(redPoints + "", width / 2 + 40, 45);
}
