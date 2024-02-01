void setup(){
  size(600, 400);
}

void draw(){
  background(255, 100, 100);
  /*
  circle(mouseX, 75, 100);
  
  //general map syntax:
    //float mappedValue = map(value, origMin, origMax, newMin, newMax);
  float mappedMouseX = map(mouseX, 0, width, 200, 400);
  circle(mappedMouseX, height - 75, 100);
  */
  circle(width / 3, height / 2, mouseY);
  float mappedSize = map(mouseY, 0, height, 50, 250);
  circle(2 * width / 3, height / 2, mappedSize);
}
