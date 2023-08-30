void setup(){
   size(500, 500); 
}

 float number = 0;

void draw(){
  background(0, 0, 255);
  strokeWeight(7);
  stroke(255, 0, 0);
  fill(0, 255, 0);
  float diam = map(sin(number), -1, 1, 0, 500);
  circle(width / 2, height / 2, diam);
  number = number + .03;
}
