void setup() {
  size(500, 500);
  //this is comment - it doesn't change the code
  //size (width, height);
  circle(100, 400, 30);
  //circle(x, y, diameter);
    //x and y are the center
  rect(0, 0, 100, 200);
  //rect (x, y, width, height);
    //x and y are the top left corner
  ellipse(0, 0, 100, 200);
  //ellipse(x, y, w, h);
    //x and y are in the center
  line(0, 0, 100, 200);
  //line(x1, y1, x2, y2)
  line(500, 0, 0, 500);
  noStroke(); //no border
  triangle(100, 400, 100, 200, 500, 300);
  stroke(0); //puts border back
  strokeWeight(12); //border width/size
  fill(111, 24, 161);
  stroke(255, 255, 0);
  circle(400, 100, 50);
}

void draw() {
  
}
