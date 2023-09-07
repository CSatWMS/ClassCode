void setup() {
  //size goes (width, height)
  size(800, 500);
}


void draw() {
  background(29, 161, 101);
  //fill (red, green, blue);
  fill(141, 29, 161);
  stroke(255, 255, 255); //white outline
  strokeWeight(3);
  //circle is (x, y, diam) (x, y) is the middle
  circle(400, 250, 100);
  
  circle(400, 250, 50);
  
  //rect(x, y, width, height) (x, y) is the top left corner
  fill(0, 0, 0);
  stroke(255, 0, 0);
  rect(75, 75, 50, 100);
  
  //square(x, y, size); (x, y) is the top left corner
  square(75, 300, 50);
  
  //ellipse(x, y, width, height) //bounding box
    //(x, y) is the middle
  ellipse(125, 75, 50, 100);
  
  triangle(100, 300, 75, 350, 125, 450);
  
  point(10, 10);
  
 /* 
 beginShape();
  vertex(200, 50); //top left corner
  
  //more vertexes
  endShape(CLOSE);
  */
  
  circle(mouseX - 20, mouseY, width - mouseX);
}
