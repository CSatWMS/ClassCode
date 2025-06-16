int numRectangles = 5;
int rectWidth = 50;
int rectHeight = 25;
IntList xValues = new IntList();
IntList yValues = new IntList();
IntList xSpeed = new IntList();
IntList ySpeed = new IntList();

IntList red = new IntList();
IntList green = new IntList();
IntList blue = new IntList();
void setup() {
  size(800, 600);
  for (int count = 0; count < numRectangles; count++) {
    red.append( (int) random(0, 256));
    green.append( (int) random(0, 256));
    blue.append( (int) random(0, 256));
    xValues.append( (int) random(0, width - rectWidth));
    yValues.append( (int) random(0, height - rectHeight));
    xSpeed.append((int) random(4, 10));
    if (random(0, 1) < .5) {
      //if I want negative initial speeds
      xSpeed.set(count, -xSpeed.get(count));
    }
    ySpeed.append((int) random(4, 10));
  }
}

void draw() {
  background(0);
  //displaying rectangles
  for (int index = 0; index < numRectangles; index++) {
    int x = xValues.get(index);
    int y = yValues.get(index);
    
    int r = red.get(index);
    int g = green.get(index);
    int b = blue.get(index);
    fill(r, g, b);
    rect(x, y, rectWidth, rectHeight);
  }

  //slide rectangles
  //to the right or left or up or down
  for (int i = 0; i < xValues.size(); i++) {
    xValues.set(i, xValues.get(i) + xSpeed.get(i));
    yValues.set(i, yValues.get(i) + ySpeed.get(i));
    //WRONG ANSWERS BELOW:
    //1. xValues.get(i) += 5; //get is a one way street
    //2. int x = xValues.get(i); variables are not
    //x += 5; backwards connected to lists
    //here, the list will not change
    //3. xValues.set(i, i + 5); //not changing the xValue
  }

  //BOUNCING
  for (int i = 0; i < numRectangles; i++) {
    int rightSide = xValues.get(i) + rectWidth;
    int leftSide = xValues.get(i);
    int topSide = yValues.get(i);
    int bottomSide = yValues.get(i) + rectHeight;
    if (rightSide > width) {
      xSpeed.set(i, -xSpeed.get(i));
      changeColor(i);
    } else if (leftSide < 0) {
      xSpeed.set(i, -xSpeed.get(i));
      changeColor(i);
    } else if (topSide < 0 || bottomSide > height) {
      ySpeed.set(i, -ySpeed.get(i));
      changeColor(i);
    }
  }
}


void changeColor(int index){
  red.set(index, (int) random(0, 256));
  green.set(index, (int) random(0, 256));
  blue.set(index, (int) random(0, 256));
}
