void setup(){
   size(400, 400); 
}

float angle = 0;

void draw(){
   background(0, 0, 0); 
   
   float sinOfAngle = sin(angle);
   float cosOfAngle = cos(angle);
   
   sinOfAngle = map(sinOfAngle, -1, 1, 0, height );
   cosOfAngle = map(cosOfAngle, -1, 1, 0, width);
   
   //circle(sinOfAngle, height / 2, 50);
   circle(cosOfAngle, sinOfAngle, 50);
   
   angle = angle + .1;
   
}
