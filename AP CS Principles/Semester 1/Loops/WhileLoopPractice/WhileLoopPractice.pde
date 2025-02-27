float x = 0; //global variables (they are not trapped)
float y = 0; //we can see them in ANY function
int diameter = 50;
void setup(){
   size(500, 500); 
   drawRandomCircle();
}

void drawRandomCircle(){
  //float variableName = random(min, max);
   x = random(0, width);
   y = random(0, height);
   
   //color c = color(r, g, b);
   float red = random(0, 256);
   float green = random(0, 256);
   float blue = random(0, 256);
   fill(red, green, blue);
   circle(x, y, diameter);
}

void draw(){
   
}

void mouseClicked(){
  //we have x and y from global variables
  //we have mouseX and mouseY from built in variables
  float xPart = x - mouseX;
  float yPart = y - mouseY;
  float distance = sqrt(xPart*xPart + yPart*yPart);
  if (distance < diameter/2){
    drawRandomCircle();
  }
}
