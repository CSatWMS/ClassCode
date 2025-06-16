int x = 0; //global variable
int xSpeed = 5;
int y = 250;
int ySpeed = -5;
int red = 255;
int green = 255;
int blue = 0;
void setup(){
  size(500, 500);
}

void draw(){
  //rect(0, 0, width, height);
  background(177, 52, 235);
  fill(red, green, blue);
  rect(x, y, 50, 50);
  x += xSpeed;
  y += ySpeed;
  if (x + 50 > width || x < 0){
     //WRAPAROUND
     //x = 0;
     
     //BOUNCE
     xSpeed = -xSpeed;
     changeColor();
  }
  
  if (y < 0 || y + 50 > height){
     ySpeed = -ySpeed; 
     changeColor();
  }

  //bounce off the top and bottom
} //ends draw

void changeColor(){
  red = (int) random(0, 256);
  green = (int) random(0, 256);
  blue = (int) random(0, 256);
}
