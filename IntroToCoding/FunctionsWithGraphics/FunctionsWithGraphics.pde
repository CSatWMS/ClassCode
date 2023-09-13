void setup(){
  
}

void draw(){
  /*
  makeChristmasCircle(10, 10, 20);
  makeChristmasCircle(30, 10, 20);
  makeChristmasCircle(50, 10, 20);
  makeChristmasCircle(70, 10, 20);
  makeChristmasCircle(90, 10, 20);
  
  makeChristmasCircle(10, 30, 20);
  makeChristmasCircle(10, 50, 20);
  makeChristmasCircle(10, 70, 20);
  makeChristmasCircle(10, 90, 20);
  */
  
  int snowManX = width / 2;
  int snowManY = 20;
  int headDiam = 20;
  makeChristmasCircle(snowManX, snowManY, headDiam);
  
  int chestDiam = 36;
  int chestY = snowManY + headDiam/2 + chestDiam / 2;
  makeChristmasCircle(snowManX, chestY, chestDiam);
  
  int bottomDiam = 66;
  int bottomY = chestY + chestDiam /2 + bottomDiam / 2;
  makeChristmasCircle(snowManX, bottomY, bottomDiam);
}

void makeChristmasCircle(int x, int y, int diam){
  stroke(255, 0, 0);
  fill(0, 255, 0);
  circle(x, y, diam);
}  
