void setup(){
  size(500, 500);
}

void draw(){
   int x = 175;
   int y = 175;
   int w = 208;
   int h = 110;
   outline(x, y, w, h);
   eyes(x, y, w, h);
   mouth(x, y, w, h);
}

void mouth(int x, int y, int w, int h){
    
}

void eyes(int x, int y, int w, int h){
   int eyeDiam = w / 10;
   int leftEyeX = x + w / 4;
   int rightEyeX = x + w * 3 / 4;
   int eyeY = y + h / 4;
   circle(leftEyeX, eyeY, eyeDiam);
   circle(rightEyeX, eyeY, eyeDiam);
}

void outline(int x, int y, int w, int h){
   rect(x, y, w, h); 
}
