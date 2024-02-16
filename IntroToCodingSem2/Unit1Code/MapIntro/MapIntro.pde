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
  /*
  circle(width / 3, height / 2, mouseY);
  
  float mappedSize = map(mouseY, 0, height, 50, 250);
  
  circle(2 * width / 3, height / 2, mappedSize);
  */
  
  //next behavior:
    //two rectangles
        //one in the top third
            //grows in width with mouseX
        //one in the bottom third
            //grows in width but only to the middle
   //rect(x, y, width, height)
   rect (0, height / 3 - 70, mouseX, 70);
   
   float mappedWidth = map(mouseX, 0, width, 0, width / 2);
   
   rect (0, 2 * height / 3, mappedWidth, 70);
   
   
   
   
   
  
  
}
