void flag(int x, int y){
  int flagHeight = 150;
  int flagWidth = 300;
  noStroke();
  rect(x, y, flagWidth, flagHeight);
  fill(227, 199, 43);
  rect(x, y, flagWidth, flagHeight / 2);
  fill(33, 24, 214);
  rect(x, y + flagHeight / 2, flagWidth, flagHeight / 4);
  fill(191, 30, 21);
  rect(x, y + flagHeight *3 / 4, flagWidth, flagHeight / 4);

}

void setup(){
   size(500, 500);
   flag(100, 100); 
   flag(0, 0); 
   //flag(100, 0); 
}

void draw(){
   println(mouseX);
   println(mouseY);
   background(#FFFFFF);
   //flag(mouseX, mouseY);
   //circle(width / 2, height / 2, mouseX);
   rect(width / 2, mouseY, 100, height-mouseY);
}
