int numSpaces = 10;
int AHome = 0;
int BHome = 11;
int full = 255;

int spaceSize = 80;
int squareSize = spaceSize;
int space1X = 200;

int homeDiam = spaceSize * 3;

int p1a, p1b, p2a, p2b;
int pieceSize = spaceSize / 2;

int middleY = 200;
int AY = middleY + pieceSize / 2;
int BY = middleY + squareSize - pieceSize / 2;

int maxMovement = 5;
int backwardsTime = 3;

void setup() {
  size(1200, 600);
  p1a = AHome;
  p1b = AHome;
  p2a = BHome;
  p2b = BHome;
}

void draw() {
  drawBoard();
  drawPieces();
  if (checkWin()){
     background(0, full, 0);
     text("WINNER!", width / 2, height / 2);
  }
}


boolean checkWin(){
  if (p1a == BHome && p1b == BHome){
     return true; 
  } else if (p2a == AHome && p2b == AHome){
    return true;
  } else {
     return false; 
  }
}

void drawBoard() {
  fill(full, full, full);
  circle(space1X - homeDiam / 2 + squareSize, middleY + squareSize / 2, homeDiam);
  int endX = space1X + numSpaces * spaceSize;
  circle(endX + squareSize / 2, middleY + squareSize / 2, homeDiam);

  for (int i = 0; i < numSpaces; i++) {
    rect(space1X + i * spaceSize, middleY, spaceSize, spaceSize);
  }
}

void drawPieces() {
  int x1a = getXForSpot(p1a);
  int x1b = getXForSpot(p1b);
  int x2a = getXForSpot(p2a);
  int x2b = getXForSpot(p2b);

  fill(full, 0, 0);
  if (x1a == x1b) {
    circle(x1b - pieceSize * 2, AY, pieceSize);
  } else {
    circle(x1b, AY, pieceSize);
  }
  circle(x1a, AY, pieceSize);

  fill(0, 0, full);
  if (x2a == x2b) {
    circle(x2b+ pieceSize * 2, BY, pieceSize);
  } else {
    circle(x2b, BY, pieceSize);
  }
  circle(x2a, BY, pieceSize);
}

int getXForSpot(int spotNumber) {
  if (spotNumber == AHome) {
    return space1X - pieceSize;
  } else if (spotNumber == BHome) {
    int endX = space1X + numSpaces * spaceSize;
    return  endX + pieceSize;
  } else {
    return ((spotNumber) * spaceSize ) + space1X - squareSize / 2;
  }
}

int rollDie() {
  int roll = (int) random(1, maxMovement);
  println(roll);
  if (roll == backwardsTime) {
    return -roll;
  } else {
    return roll;
  }
}

String collidesWithPiece(int x, int y) {
  int x1a = getXForSpot(p1a);
  int x1b = getXForSpot(p1b);
  int x2a = getXForSpot(p2a);
  int x2b = getXForSpot(p2b);
  //AY and BY

  if (dist(x1a, AY, x, y) < pieceSize) {
    return "p1a";
  }
  if (dist(x1b, AY, x, y) < pieceSize) {
    return "p1b";
  }
  if (dist(x2a, BY, x, y) < pieceSize) {
    return "p2a";
  }
  if (dist(x2b, BY, x, y) < pieceSize) {
    return "p2b";
  }

  return "none";
}



void mousePressed() {
  String piece = collidesWithPiece(mouseX, mouseY);

  if (piece != "none") {
    int move = rollDie();
    if (piece == "p1a" || piece == "p1b") {
      if (piece == "p1a") {
        if (p1a + move <= BHome) {
          p1a += move;
        }
      } else {
        if (p1b + move <= BHome) {
          p1b += move;
        }
      }
    } else {
      //it's p2, cause it's not none and it's not p1
      if (piece == "p2a") {
        if (p2a - move >= AHome) {
          p2a -= move;
        }
      } else {
        if (p2b - move >= AHome) {
          p2b -= move;
        }
      }
    }
  }
}
