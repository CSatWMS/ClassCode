void setup() {
  size(500, 500);

  //1, 3, 5, 7, 9
  int num1 = 1;
  while (num1 <= 9) {
    print(num1 + ", ");
    num1 = num1 + 2; //num1 += 2
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

  printNumber(2, 5);
  printNumber(7, 3);

  fancyPrint(3, 11);

  //drawTopRow(50);
  //drawTopRow(50);

  drawBullsEye(75);
} //ends the setup

void drawBullsEye(int gapSize) {
  int x = width / 2;
  int y = height / 2;
  int diameter = width;
  int francis = 0;

  while (diameter > 0) {
    francis++;
    if (francis % 2 == 0) {
      fill(255, 0, 0);
    } else {
      fill(255, 255, 255);
    }
    circle(x, y, diameter);
    diameter -= gapSize;
  }
}

//GOAL: fill top row with circles
void drawTopRow(int diam) {
  int radius = diam / 2;
  int x = radius;
  int y = radius;
  int numCircles = width / diam;
  int counter = 0;
  while (counter < numCircles) {
    // while (x < width){
    if (counter % 3 == 0) {
      fill(255, 0, 0);
    } else if (counter % 3 == 1) {
      fill(0, 255, 0);
    } else if (counter % 3 == 2) {
      fill(0, 0, 255);
    } else {
      fill(255, 255, 255);
    }
    circle(x, y, diam);
    x += diam; //x = x + diam;
    counter++;
  }
}


//GOAL: write a function, called fancyPrint, that takes in two integers
//count UP from a to b (assume a is smaller than b)
//label even
//label round (divisible by 5)
//label both (divisible by 5 and even)

//fancyPrint(3, 11);
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
    small++;
  }
}


//write a function, called printNumbers, that takes in two integer parameters
//count up or down appropriately
//printNumbers(2, 5) -> 2, 3, 4, 5
//printNumber(7, 3) -> 7, 6, 5, 4, 3

void printNumber(int a, int b) {
  println();
  if (a < b) {
    //Count UP
    int walky = a;
    while (walky <= b) {
      print(walky + ", ");
      walky++;
    }
  } else {
    //count DOWN
    int walky = a;
    while (walky >= b) {
      print(walky + ", ");
      walky--;
    }//closes while
  } //closes the else
}//closes the function
