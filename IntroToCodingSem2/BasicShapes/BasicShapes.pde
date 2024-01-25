void setup(){
  //this is a comment
  //size(width, height);
  size(800, 400);
}



void draw() {
  background(255, 255, 255);
 
  //circle(mouseX, mouseY, 100);
  circle(width / 2, height / 2, 100);
  
   fill(86, 24, 140);
  stroke(250, 25, 179);
  
  //square(x, y, size) -> x and y are the top left corner
  square(50, 50, 100);
  
  //triangle(x1, y1, x2, y2, x3, y3) -> goes counterclockwise
  triangle(150, 210, 75, 300, 225, 300);
  
  fill(0, 0, 255);
  stroke(255, 255, 255);
  //rect(x, y, width, height) -> x and y are the top left corner
  rect(300, 100, 100, 40);
  
  //ellipse(x, y, width, height)
  //x and y are the center 
  ellipse(300, 100, 100, 40);
  
  //custom Shapes
  //plays connect the dots
  beginShape();
  vertex(550, 210); //this is a point on the screen
  vertex(475, 300);
  vertex(550, 400);
  
  vertex(mouseX, mouseY);
  endShape(CLOSE);
}
