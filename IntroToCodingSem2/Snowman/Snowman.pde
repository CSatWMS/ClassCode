void setup(){
  size(500, 500); 
}

void draw(){
  background(0, 0, 0);
  int xHead = width / 2;
  int yHead = mouseY / 2;
  int sizeHead = mouseY;
  drawBodyPart(xHead, yHead, sizeHead);
  
  int sizeMiddle = sizeHead * 2;
  int xMiddle = xHead;
  int yMiddle = yHead + sizeHead/2 + sizeMiddle/2;
  drawBodyPart(xMiddle, yMiddle, sizeMiddle);
  drawButtons(xMiddle, yMiddle, sizeMiddle);
}

void drawButtons(int x, int y, int size){
   fill(0, 0, 0);
   int buttonSize = size / 10;
   circle(x, y, buttonSize);
   int topButtonY = y - size / 4;
   circle(x, topButtonY, buttonSize);
   int bottomButtonY = y + size / 4;
   circle(x, bottomButtonY, buttonSize);
}

void drawBodyPart(int x, int y, int size){
   noStroke();
   fill(255, 255, 255);
   circle(x, y, size);
}
