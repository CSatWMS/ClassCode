void setup(){
  size(400, 400);
}

void draw(){
  background(100, 0, 255);
  /*
   circle(mouseX, 100, 50); 
   
   float mappedX = map(mouseX, 0, width, width, 0);
   
   circle(mappedX, 300, 50);
   */
   /*
   circle(width / 5, height / 2, mouseX);
   
   float mappedDiam = map(mouseX, 0, width, 10, 100);
   
   circle(width * 4 / 5, height / 2, mappedDiam);
   */
   
   //circle goes up and down 
   
   /*
   circle(100, mouseY, 50);
   
   float mappedY = map(mouseY, 0, height, height / 3, height * 2 / 3);
   
   circle(300, mappedY, 50);
   */
   
   //rectangles that resize
   rect( 0,height / 8,  mouseX, 50);
   
   float mappedWidth = map(mouseX, 0, width, 0, width / 3);
   
   rect( 0, 5* height / 8,  mappedWidth, 50);
}
