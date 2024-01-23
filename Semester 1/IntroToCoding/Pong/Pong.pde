//1. Show the screen
//2. Paddles going
//3. Ball Going
//4. Collision Detection

int rightScore = 0;
int leftScore = 0;



Paddle leftPaddle;
Paddle rightPaddle;
TravellingBall traveler;

void setup(){
  size(800, 500);
  int offset = width / 80;
  leftPaddle = new Paddle(offset);
  rightPaddle = new Paddle(width - 2*offset);
  traveler = new TravellingBall(offset*2, color(255, 0, 0));
}

void draw(){
  showScreen();
  traveler.move();
  paddleBounce();
  updateScore();
}

void showScreen(){
    background(0, 0, 0);
    
    drawMiddleLine();
    showScores();
    leftPaddle.show();
    rightPaddle.show();
    traveler.show();
}

void paddleBounce(){
  //the right paddle test
   if ( traveler.x + traveler.size / 2 >= rightPaddle.x //if the right side of the paddle
         && traveler.y >= rightPaddle.y
         && traveler.y <= rightPaddle.y + rightPaddle.h){
             traveler.dx = -traveler.dx;
         }
    if (traveler.x - traveler.size / 2 <= leftPaddle.x + leftPaddle.w
        && traveler.y >= leftPaddle.y
        && traveler.y <= leftPaddle.y + leftPaddle.h){
            traveler.dx = -traveler.dx;
        }
         
}

void updateScore(){
   //if we go off the right side
   if (traveler.x > width){
       leftScore = leftScore + 1;
       traveler.x = width / 2;
       traveler.y = height / 2;
   }
}

void showScores(){
  fill(255, 255, 255);
  textSize(height/10);
  text(leftScore, width / 2 - 50, height / 10);
  text(rightScore, width / 2 + 25, height / 10);
}

void drawMiddleLine(){
   //rect(x, y, w, h);
   fill(255, 255, 255);
   int rectWidth = width / 75;
   int rectHeight = height / 25;
   int x = width / 2 - rectWidth / 2;
   int y = 0;
   while ( y < height){
     rect(x, y, rectWidth, rectHeight);
     y = y + 3*rectHeight/2;
   }
}

void keyPressed(){
  if (keyCode == UP){
      rightPaddle.moveUp();
  } 
  if (keyCode == DOWN){
     rightPaddle.moveDown();
  }
  if (key == 'w'){
     leftPaddle.moveUp(); 
  }
  if (key == 's'){
     leftPaddle.moveDown(); 
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
   
   void moveUp(){
      y = y - dy;
      if (y < 0){
         y = 0; 
      }
   }
   
   void moveDown(){
     if (y + h + dy > height){
       //do nothing
       y = height - h;
     } else {
      y = y + dy; 
     }
   }
} //closes paddle class

class TravellingBall{
  int size;
  color c;
  int dx;
  int dy;
  int x;
  int y;
  
  public TravellingBall(int mySize, int myColor){
    size = mySize;
    c = myColor;
    x = width/2;
    y = height / 2;
    if (random(-10, 10) < 0){
       dx = -5; 
    } else {
       dx = 5; 
    }
    
    if (random(-10, 10) < 0){
       dy = -5; 
    } else {
       dy = 5; 
    }
    
    //INITIAL TESTING CONDITIONS
    dx = 5;
    dy = 0;
  
  }
  
  void show(){
     fill(c);
     circle(x, y, size);
  }
  
  void move(){
     x = x + dx;
     y = y + dy;
     
     if (y == 0){
      dy = -dy; 
     } else if ( y + size / 2 > height){
        dy = -dy; 
     }
  }
  
} //closes the travellingBall class
