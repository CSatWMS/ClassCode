IntList xs = new IntList();
IntList ys = new IntList();
IntList sizes = new IntList();
IntList speeds = new IntList();
int numberOfStars = 10;
int count = 0;

void setup(){
  size(400, 600);
    for (int i = 0; i < numberOfStars; i++){
      xs.append( (int) random(0, width));
      ys.append( (int) random(0, height));
      sizes.append( (int) random(15, 25));
      speeds.append( (int) random(2, 2));
    }
}

void draw(){
  background(0);
  text(count + " stars", 10, 10);
    for (int i = 0; i < numberOfStars; i++){
      int x = xs.get(i);
      int y = ys.get(i);
      int size = sizes.get(i);
      if (CollidesWithStar(x, y, size / 2)){
          fill(0, 255, 0);
          count++;
      }else {
         fill(255); 
      }
      circle(x, y, size);
      //x = x + 5;
      xs.set(i, x + speeds.get(i));
      if (xs.get(i) > width){
         xs.set(i, 0); 
      }
    }
}  

boolean CollidesWithStar(int starX, int starY, int radius){
  //SquareRoot((y2 - y1)^2 + (x2 - x1)^2)
  int yPart = mouseY - starY;
  int xPart = mouseX - starX;
  int ySquared = yPart * yPart;
  int xSquared = xPart * xPart;
  float distance = sqrt(ySquared + xSquared);
  if (distance <= radius){
     return true; 
  } else {
     return false; 
  }
}
