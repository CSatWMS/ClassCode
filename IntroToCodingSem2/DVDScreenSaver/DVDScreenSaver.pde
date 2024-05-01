Bouncer dvd = new Bouncer(color(0, 0, 255), 10, 10, 5, 2, 40);

Bouncer[] chaos = new Bouncer[100];

void setup(){
  size(400, 400);
  int index = 0;
  while (index < chaos.length){
    float red = random(30, 256);
     float green = random(30, 256);
     float blue = random(30, 256);
     color myColor = color(red, green, blue);
     
    chaos[index] = new Bouncer(myColor, 
                  (int) random(0, width), 
                  (int) random(0, height), 
                  (int) random(-10, 10), 
                  (int) random(-10, 10), 
                  (int) random(20, 50) );
    index = index + 1;
  }
}

void draw(){
   background(0, 0, 0);
   dvd.see(); 
   dvd.move();
   dvd.bounce();
   
   int index = 0 ;
   while (index < chaos.length){
      chaos[index].see();
      chaos[index].move();
      chaos[index].bounce();
     index = index + 1;
   }
   
}


class Bouncer{
   color myColor;
   int xLoc, yLoc, dx, dy, size;
   
   public Bouncer(color c, int x, int y, int DX, int DY, int s){
     myColor = c;
     xLoc = x;
     yLoc = y;
     dx = DX;
     dy = DY;
     size = s;
   }
   
   void see(){
       fill(myColor);
      rect(xLoc, yLoc, size, size);
      textSize(40);
      //text(":)", xLoc, yLoc);
   }
   
   void move(){
     xLoc = xLoc + dx;
     yLoc = yLoc + dy;
   }
   
   void changeColor(){
     float red = random(30, 256);
     float green = random(30, 256);
     float blue = random(30, 256);
     myColor = color(red, green, blue);
   }
   
   void bounce(){
     if (xLoc + size >= width){
       changeColor();
       dx = -dx;
       
     } else if (xLoc <= 0){
       changeColor();
       dx = -dx; 
      // dy = dy + 3; //changes angle of reflection
     } else if (yLoc <= 0){
        dy = -dy;
        changeColor();
     } else if (yLoc + size >= height){
        dy = -dy;
        changeColor();
     }
   }
   
} //ends the Bouncer class
