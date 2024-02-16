int myLocation = 0;
int stepSize = 2;
int myLocationY = 0;
int myStepSizeY = 5;

void setup(){
  size(500, 500); 
}

void draw(){
   background(250, 212, 212);
   rect(myLocation, myLocationY, 50, 50);
   myLocation = myLocation + stepSize;
   myLocationY = myLocationY + myStepSizeY;
}
