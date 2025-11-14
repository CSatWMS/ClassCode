void setup() {
  size(300, 300);
  fillRow(40);
  //drawBullsEye(5);
}

void drawBullsEye(int gapSize){
  int diam = width;
  int counter = 0;
  while (diam > 0){
     if (counter % 2 == 0){
        fill(255); 
     } else {
        fill(255, 0, 0); 
     }
     circle(width / 2, height / 2, diam);
     diam -= gapSize;
     counter++;
  }
  
}

void fillRow(int diam) {
  int numCircles = width / diam;
  int x = diam / 2;
  int counter = 100;
    int y = diam / 2;
  //while (counter < numCircles) {
  while (x < width){
    if (counter % 5 == 0) {
      fill(255, 0, 0); //RED
    } else if (counter % 5 == 1) {
      fill(0, 255, 0); //GREEN
    } else if (counter % 5 == 2){
      fill(0, 0, 255); //BLUE
      } else if (counter % 5 == 3){
        fill(#000000);
    } else {
      fill(255, 255, 255);
    }
    circle(x, y, diam);
    counter++;
    x += diam;
  }
}
