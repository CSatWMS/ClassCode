void setup(){
  size(500, 500);
  drawGradientBackground(height / 4, 3*height / 4, 2, random(0, 256), random(0, 256), random(0, 256));
}

void drawGradientBackground(int startY, int endY, int spacing, float red, float green, float blue){
  //227, 90, 5
   float numRectangles = (endY - startY) / spacing;
   float amountOfRedChange = red / numRectangles;
   float amountOfGreenChange = green / numRectangles;
   float amountOfBlueChange = blue / numRectangles;
   float r = 0, g = 0, b = 0;
   noStroke();
   int y = startY;
   while (y < endY){
     fill(r, g, b);
      //rect
      rect(0, y, width, spacing);
      y = y + spacing; //y += 5;
      r += amountOfRedChange;
      g += amountOfGreenChange;
      b += amountOfBlueChange;
   }
}
