void setup() {
  size(300, 300);
  //fillRow(50);
  drawBullsEye(5);
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
  //A
  int x = diam / 2;
  int counter = 0;
  while (counter < numCircles) {
    //while (x < width){
    //B
    int y = diam / 2;
    if (counter % 3 == 0) {
      fill(255, 0, 0);
    } else if (counter % 3 == 1) {
      fill(0, 255, 0);
    } else if (counter % 3 == 2){
      fill(0, 0, 255);
    } else {
      fill(255, 255, 255);
    }
    circle(x, y, diam);
    counter++;
    //C
    x += diam;
  }
  //D
}
