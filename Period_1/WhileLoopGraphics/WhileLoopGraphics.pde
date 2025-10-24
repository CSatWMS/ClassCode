void setup(){
   size(500, 500); 
   fillRow(20);
}

void fillRow(int diam){
  int numCircles = width / diam;
  //A
    int x = diam / 2;
  int counter = 0;
  while (counter < numCircles){
    //B
    int y = diam / 2;
    circle(x, y, diam);
    counter++;
    //C
    x += diam;
  }
  //D
}
