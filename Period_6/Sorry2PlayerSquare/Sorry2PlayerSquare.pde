int squareSize = 100;
int halfSize = squareSize / 2;
int quarterSize = halfSize / 2;

int pieceSize = 15;

int topLeftCorner = 1;
int topRightCorner = 5;
int bottomRightCorner = 9;
int bottomLeftCorner = 13;

int maxNumSpots = 16;

int redStart = 14;
int redHome = 12;
int blueStart = 6;
int blueHome = 4;

int a1 = 14;
int a2 = 14;
int b1 = 6;
int b2 = 6;

int pieceOffset = quarterSize / 2;

int full = 255;

//color hotPink = color(255, 10, 15);
//fill(hotPink);

int turnCounter = 0;
void setup() {
  size(500, 500);
  frameRate(5);
}

void draw() {
  fill(full);
  ellipse(width / 2, height / 2, squareSize, squareSize);
  drawBoard();
  drawPieces();
  fill(0);

  int move = roll();
  if (turnCounter % 4 == 0) {
    if (a1 == redHome) {
      if (move == 1) {
        a1 +=1;
      }
    } else {
      a1 += move;
    }
    a1 = a1 % maxNumSpots;

    if (a1 == b2) {
      text("B2 CAPTURED!", width / 2, height / 2);
      b2 = blueStart;
    } else if (a1 == b1) {
      text("B1 CAPTURED!", width / 2, height / 2);
      b1 = blueStart;
    }
  } else if (turnCounter % 4 == 2) {
    if (a2 == redHome) {
      if (move == 1) {
        a2 +=1;
      }
    } else {
      a2 += move;
    }
    
    a2 = a2 % maxNumSpots;

    if (a2 == b2) {
      text("B2 CAPTURED!", width / 2, height / 2);
      b2 = blueStart;
    } else if (a2 == b1) {
      text("B1 CAPTURED!", width / 2, height / 2);
      b1 = blueStart;
    }
  } else if (turnCounter% 4 ==1) {
    if (b1 == blueHome) {
      if (move == 1) {
        b1 +=1;
      }
    } else {
      b1 += move;
    }
    b1 = b1 % maxNumSpots;
    if (b1 == a1) {
      text("A1 CAPTURED!", width / 2, height / 2);
      a1 = redStart;
    } else if (a2 == b1) {
      text("A2 CAPTURED!", width / 2, height / 2);
      a2 = redStart;
    }
  } else if (turnCounter%4 == 3) {
    if (b2 == blueHome) {
      if (move == 1) {
        b2 +=1;
      }
    } else {
      b2 += move;
    }
    b2 = b2 % maxNumSpots;

    if (a2 == b2) {
      text("A2 CAPTURED!", width / 2, height / 2);
      a2 = redStart;
    } else if (a1 == b2) {
      text("A1 CAPTURED!", width / 2, height / 2);
      a1 = blueStart;
    }
  }
}


void drawPieces() {

  if (a1 == redStart) {
    drawAtHome(a1, true, full, 0, 0, full);
  } else {
    drawSinglePiece(a1, full, 0, 0, full);
  }

  if (a2 == redStart) {
    drawAtHome(a2, false, full, 0, 0, 0);
  } else {
    drawSinglePiece(a2, full, 0, 0, 0);
  }

  if (b1 == blueStart) {
    drawAtHome(b1, true, 0, 0, full, full);
  } else {
    drawSinglePiece(b1, 0, 0, full, full);
  }

  if (b2 == blueStart) {
    drawAtHome(b2, false, 0, 0, full, 0);
  } else {
    drawSinglePiece(b2, 0, 0, full, 0);
  }

  stroke(0);

  turnCounter++;
}

int roll() {
  int result = (int) random(1, 6);
  if (result == 2) {
    result = -2;
  }
  return result;
}

void drawAtHome(int number, boolean isTop, int r, int g, int b, int strokeColor) {
  int x = getX(number);
  int y =getY(number);
  fill(r, g, b);
  stroke(strokeColor);
  if (isTop) {
    y -= pieceOffset;
  } else {
    y += pieceOffset;
  }
  if (r == full) {

    x += halfSize;
  } else {
    x -= halfSize ;
  }
  circle(x, y, pieceSize);
}

void drawSinglePiece(int number, int r, int g, int b, int strokeColor) {
  fill(r, g, b);
  stroke(strokeColor);
  int x = getX(number);
  int y =getY(number);
  circle(x, y, pieceSize);
}

void drawBoard() {

  //squares
  int numSquares =  width / squareSize;
  for (int i = 0; i < numSquares; i++) {
    for (int k = 0; k < numSquares; k++) {
      if (i == 0 || k == 0 || i == numSquares - 1 || k == numSquares - 1) {
        fill(full);
        rect(i*squareSize, k*squareSize, squareSize, squareSize);
      }
    }
  }

  //number labels
  for (int i = 1; i <= maxNumSpots; i++) {
    int x = getX(i);
    int y = getY(i);
    fill(0);
    textSize(10);
    text(i + "", x - quarterSize, y - quarterSize);
  }

  //home and starts
  //redStart
  int x = getX(redStart) + halfSize;
  int y = getY(redStart);
  fill(full, 0, 0);
  ellipse(x, y, quarterSize, squareSize);

  //redHome
  x = getX(redHome);
  y = getY(redHome) - squareSize;
  fill(full, 0, 0);

  rect(x - quarterSize / 2, y, quarterSize, halfSize);
  ellipse(x, y, halfSize, quarterSize);

  //blueStart
  x = getX(blueStart) - halfSize;
  y = getY(blueStart);
  fill(0, 0, full);
  ellipse(x, y, quarterSize, squareSize);
  //blueHome
  x = getX(blueHome);
  y = getY(blueHome) + squareSize;
  rect(x - quarterSize / 2, y - halfSize, quarterSize, halfSize);
  ellipse(x, y, halfSize, quarterSize );


  strokeWeight(1);
}

int getX(int spotNumber) {
  int result = squareSize / 2;
  if (spotNumber ==1 || spotNumber >= bottomLeftCorner) {
    return result;
  }
  if (spotNumber == 2 || spotNumber == bottomLeftCorner - 1) {
    result += squareSize;
  } else if (spotNumber == topLeftCorner + 2 || spotNumber == bottomLeftCorner - 2) {
    result += squareSize * 2;
  } else if (spotNumber == topRightCorner - 1 || spotNumber == bottomRightCorner + 1) {
    result += squareSize;
    result += squareSize;
    result += squareSize;
  } else {
    result = width - result;
  }
  return result;
}

int getY(int spotNumber) {
  int result = squareSize / 2;
  if (spotNumber <= topRightCorner) {
    return result;
  } else if (spotNumber == maxNumSpots || spotNumber == topRightCorner + 1) {
    result += squareSize;
  } else if (spotNumber == maxNumSpots - 1 || spotNumber == topRightCorner + 2) {
    result += squareSize * 2;
  } else if (spotNumber == bottomLeftCorner + 1 || spotNumber == bottomRightCorner - 1) {
    result += squareSize;
    result += squareSize;
    result += squareSize;
  } else {
    result = height - result;
  }
  return result;
}
