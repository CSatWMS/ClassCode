void setup(){
  size(500, 500); 
}

void draw(){
  background(0, 0, 0);
  int xHead = width / 2;
  int yHead = mouseY / 2;
  int sizeHead = mouseY;
  drawBodyPart(xHead, yHead, sizeHead);
  drawEyes(xHead, yHead, sizeHead);
  
  int sizeMiddle = sizeHead * 2;
  int xMiddle = xHead;
  int yMiddle = yHead + sizeHead/2 + sizeMiddle/2;
  drawBodyPart(xMiddle, yMiddle, sizeMiddle);
  drawButtons(xMiddle, yMiddle, sizeMiddle);
  
  int sizeBottom = sizeMiddle * 3 / 2;
  int xBottom = xMiddle;
  int yBottom = yMiddle + sizeMiddle / 2 + sizeBottom / 2;
  drawBodyPart(xBottom, yBottom, sizeBottom);
}

void drawEyes(int xHead, int yHead, int headSize){
  //yvalue for eyes
  //offset left/right for eyes
  //xValue(S) for eyes
  //eyeSize
  int rightEyeX = xHead + headSize / 6;
  int leftEyeX = xHead - headSize / 6;
  int eyeY = yHead - headSize / 7;
  int eyeSize = headSize / 8;
  
  fill(0, 0, 255);
  
  //do the graphics stuff for eyes (are they black, blue, etc?)
  //two circle (or ellipse?)
  circle(rightEyeX, eyeY, eyeSize);
  circle(leftEyeX, eyeY, eyeSize);
  
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
