void setup() {
  size(500, 500);
  //1, 3, 5, 7, 9
  int num1 = 1;
  while (num1 <= 9) {
    print(num1 + ", ");
    num1+=2;
  }
  println();
  //25, 20, 15, 10, 5, 0, -5, -10
  int num2 = 25;
  while (num2 >= -10) {
    print(num2 + ", ");
    num2 -= 5;
  }
  println();
  //81, 27, 9, 3, 1
  int num3 = 81;
  while (num3 >= 1) {
    print(num3 + ", ");
    num3 /= 3;
  }
  fancyPrint(3, 11);
  drawTopRow(100);
  drawTopRow(50);
  drawTopRow(10);
} //ends my setup function

//GOAL: Draw a row of circles at the top, given the diameter
void drawTopRow(int diam) {
  int radius = diam / 2;
  int y = radius;
  int x = radius;
  int numCircles = width / diam;
  int counter = 0;
  while (counter < numCircles) {
    circle(x, y, diam);
    x += diam;
    counter++;
  }
}

//GOAL: fancyPrint function - is to label the numbers between a and b
//even (divisible by 2)
//round (divisible by 5)
//both (divisible by 2 and 5)
//fancyPrint(3, 11)
//3
//4 - even
//5 - round
//6 - even
//7
//8 - even
//9
//10 - both
//11
void fancyPrint(int small, int big) {
  println();
  while (small <= big) {
    print(small);
    if (small % 2 == 0 && small % 5 == 0) {
      print(" - both");
    } else if (small % 2 == 0) {
      print(" - even");
    } else if (small % 5 == 0) {
      print(" - round");
    }
    println();
    small = small + 1;
  }
}
