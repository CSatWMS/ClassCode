Bouncer dvd = new Bouncer(color(0, 0, 255), 10, 10, 5, 2, 15);

void setup(){
  size(400, 400);
}

void draw(){
   dvd.see(); 
   dvd.move();
   dvd.bounce();
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
   }
   
   void move(){
     xLoc = xLoc + dx;
     yLoc = yLoc + dy;
   }
   
   void bounce(){
     if (xLoc + size >= width){
       dx = -dx;
     }
   }
   
} //ends the Bouncer class
