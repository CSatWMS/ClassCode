void drawBodyPart(int x, int y, int diam){
  strokeWeight(4);
  stroke(0, 0, 255);
  fill(255, 255, 255);
  circle(x, y, diam);
}

void setup(){
   size(500, 500); 
}

void buttons(int x, int y, int diam){
   int buttonDiam = diam / 20;
   fill(0, 0, 0);
   stroke(0, 0, 0);
   //middle button
   circle(x, y, buttonDiam);
   //top button
   int offset = diam / 6;
   int topButtonY = y - offset;
   circle(x, topButtonY, buttonDiam);
   //bottom button
   int bottomButtonY = y + offset;
   circle(x, bottomButtonY, buttonDiam);
}

void eyeballs(int x, int y, int diam){
  int offsetY = diam / 4;
  //y value for eyeballs?
  int yball = y - offsetY;
  
  //left x eye?
  //right x eye?
  //eye diam?
  int eyeDiam = diam / 8;
  circle(x, yball, eyeDiam);
}

void draw(){
    background(0, 0, 0);
   int headX = mouseX;
   int headDiam = mouseY;
   int headY = headDiam / 2;
   drawBodyPart(headX, headY, headDiam);
   eyeballs(headX, headY, headDiam);
   
   int bodyX = headX;
   int bodyDiam = headDiam * 2;
   int bodyY = headY + headDiam / 2 + bodyDiam / 2;
   drawBodyPart(bodyX, bodyY, bodyDiam);
   buttons(bodyX, bodyY, bodyDiam);
   
   int footX = bodyX;
   int footDiam = headDiam * 3;
   int footY = bodyY + bodyDiam / 2 + footDiam / 2;
   drawBodyPart(footX, footY, footDiam);
}
