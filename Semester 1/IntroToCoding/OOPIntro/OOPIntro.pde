BouncingBox bouncer = new BouncingBox(20, 20, 30, 30, -5, 5);
BouncingBox bouncer2 = new BouncingBox(50, 50, 30, 30, 5, -5);

BouncingBox[] chaos = createChaos(15);

BouncingBox[] createChaos(int number){
 BouncingBox[] boxes = new BouncingBox[number];
 int i = 0;
 while (i < number){
   boxes[i] = new BouncingBox((int) random(0, width),(int)  random(0, height),(int)  random(10, 50),(int)  random(10, 50), (int) random(-10, 10), (int) random(-10, 10));
   
   i = i + 1;
 }
 return boxes;
}

void setup(){
  size(500, 500);
}

void draw(){
  background(0, 0, 0);
  bouncer.show();
  bouncer.move();
  bouncer.bounce();
  
  bouncer2.show();
  bouncer2.move();
  bouncer2.bounce();
  
  int i = 0;
  while (i < chaos.length){
    chaos[i].show();
    chaos[i].move();
    chaos[i].bounce();
    i = i + 1;
  }
}

class BouncingBox {
  int x;
  int y;
  int w;
  int h;
  int dx;
  int dy;
  color myColor;
  
  //constructor
  public BouncingBox(int myX, int myY, int myW, int myH, int myDX, int myDY){
    x = myX;
    y = myY;
    w = myW;
    h = myH;
    dx = myDX;
    dy = myDY;
    myColor = color(0, 0, 255);
  }  
  
  void show(){
     fill(myColor);
     rect(x, y, w, h); 
  }
  
  void move(){
    x = x + dx;
    y = y + dy;
  }
  
  void bounce(){
    if (x <= 0 || x >= width - w){
       dx = -dx; 
       changeColor();
    }
    if (y <= 0 || y >= height - h){
       dy = -dy; 
       changeColor();
    }
  }
  
  void changeColor(){
     float r = random(0, 255);
     float g = random(0, 255);
     float b = random(0, 255);
     myColor = color(r, g, b);
  }
  
  
  
}
