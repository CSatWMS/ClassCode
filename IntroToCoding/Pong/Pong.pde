//1. Show the screen
//2. Paddles going
//3. Ball Going
//4. Collision Detection

int rightScore = 0;
int leftScore = 0;



Paddle leftPaddle;
Paddle rightPaddle;

void setup(){
  size(800, 500);
  int offset = width / 80;
  leftPaddle = new Paddle(offset);
  rightPaddle = new Paddle(width - 2*offset);
}

void draw(){
  showScreen();
}

void showScreen(){
    background(0, 0, 0);
    
    drawMiddleLine();
    showScores();
    println(leftPaddle.y);
    leftPaddle.show();
    rightPaddle.show();
}

void showScores(){
  fill(255, 255, 255);
  textSize(height/10);
  text(leftScore, width / 2 - 50, height / 10);
  text(rightScore, width / 2 + 25, height / 10);
}

void drawMiddleLine(){
   //rect(x, y, w, h);
   int rectWidth = width / 75;
   int rectHeight = height / 25;
   int x = width / 2 - rectWidth / 2;
   int y = 0;
   while ( y < height){
     rect(x, y, rectWidth, rectHeight);
     y = y + 3*rectHeight/2;
   }
}

class Paddle{
   int w;
   int h;
   int dy;
   int y;
   int x;
   
   public Paddle(int startingX){
      x = startingX;
      h = height / 10;
      w = width / 80;
      y = height / 2 - h / 2;
      dy = height / 20;
   }
   
   void show(){
      fill(255, 255, 255);
      rect(x, y, w, h); 
   }
}
