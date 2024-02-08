float x = 250;
float y = 250;

float ang = 0.1;

void setup(){
   size(500, 500); 
}

void draw(){
   background(123, 21, 163);
   
   float sinAns = sin(ang);
   float cosAns = cos(ang);
   y = map(sinAns, -1, 1, 0, height);
   x = map(cosAns, -1, 1, 0, width);
   circle(x, y, y);
   ang = ang + 0.01;
}
