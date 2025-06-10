void setup(){
  size(500, 500);
  background(255, 255, 255);
  //body
  fill(66, 201, 120);
  rect(100, 150, 6 * 50, 50);
  //front wheel
  fill(0, 0, 0);
  circle(175, 225, 50);
  fill(200, 200, 200);
  circle(175, 225, 40);
  //back wheel
  fill(0, 0, 0);
  circle(175 + 150, 225, 50);
  fill(200, 200, 200);
  circle(175 + 150, 225, 40);
  //windshield
    stroke(76, 224, 237);
    strokeWeight(8);
    //front
    line(150, 150, 200, 100);
    //back
    line(300, 100, 350, 150);
  //roof
  stroke(0);
  line(200, 100, 300, 100);
}

void draw(){
  
}
