
void setup() {
  size(500, 500);
  //drawCircleRow(100);
  drawCircleRow(50);
  //drawCircleRow(10);
  
  //drawBullsEye(75);
}

void drawBullsEye(int gapSize){
  int x = width / 2;
  int y = height / 2;
  int diam = width;
  while (diam > 1){
  circle(x, y, diam);
  diam -= gapSize;
  }
  
}

void drawCircleRow(int diam) {
  int numCircles = width / diam;
  int count = 0;
  int radius = diam / 2;
  int x = radius;
  int y = radius;
  while (count < numCircles) {
  //while (x < width){
    if (count % 3 == 0){
       fill(255, 0, 0); 
    } else if (count % 3 == 1){
        fill(0, 255, 0);
    } else if (count % 3 == 2){
        fill(0, 0, 255);
    } else {
       fill(255, 255, 255); 
    }
    circle(x, y, diam);
    x += diam; //x = x + diam;
    count++;
  }
}
