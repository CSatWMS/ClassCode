int bluePoints = 0;
int redPoints = 0;
Paddle bluePaddle = new Paddle(20, 500 / 2 - 70 / 2, 20, 70, color(0, 0, 255));
Paddle redPaddle = new Paddle(800 - 20 * 2, 500 / 2 - 70 / 2, 20, 70, color(255, 0, 0));

void setup(){
  size(800, 500);
}

void draw(){
   drawScreen();
   bluePaddle.display();
   redPaddle.display();
}

void drawScreen(){
    background(0, 0, 0);
    strokeWeight(4);
    stroke(255, 255, 30);
   int lineLength = 10;
   int y1 = 0;
   int x = width / 2;
   while (y1 < height){
      int y2 = y1 + lineLength;
      line(x, y1, x, y2);
      y1 = y1 + lineLength * 2;
   }
   textSize(50);
   fill(255, 0, 0);
   text(redPoints + "", width / 2 + 40, 45);
   fill(0, 0, 255);
   text(bluePoints + "", width / 2 - 65, 45);
}

class Paddle{
  //variables (instance variables)
  int x, y, w, h;
  color c;
  //constructor
  public Paddle(int X, int Y, int W, int H, color C){
    x = X;
    y = Y;
    w = W;
    h = H;
    c = C;
  }
  //methods
  
  void display(){
    strokeWeight(1);
    fill(c);
    rect(x, y, w, h);
  }
  
  void moveUp(){
    
  }
  
  void moveDown(){
    
  }
  
} //closes the Paddle class
