int diam = 100;

void setup(){
  size(400, 400);
}

void draw(){
  background(0, 0, 255);
  circle(width/2, height/2, 100);
  
  
  //Variables!
  //dataType variableName = initialValue
  int xThreeQuarters = width * 3 / 4;
  int yQuarter = height / 4;
  circle(xThreeQuarters, yQuarter, diam);
 // diam = diam + 1;
  
  float mappedDiam = map(mouseX, 0, width, 100, 200);
  circle(width/2, height/2, mappedDiam);
  
  //map(initalVar, start, stop, desiredStart, desiredStop)
  
}
