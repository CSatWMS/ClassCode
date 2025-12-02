int A, B, C, D, E, F;
boolean needA, needB, needC, needD, needE, needF;
int fullLight = 255;

color white = #FFFFFF;

int duckWidth = 200;
int duckHeight = 100;

int labelX = 125;
int labelY = 275;

int topDuckY = 300;
int xDC = 0;
int xEB = 200;
int xFA = 400;


void setup() {
  size(600, 500);
  populateSpacePond();
  generateFlockPattern();
}

void draw() {
  drawBoard();
}

void drawLabel(String str, color background, color text) {
  fill(background);
  rect(0, 2*duckHeight, width, duckHeight);
  fill(text);
  strokeWeight(3);
  textSize(75);
  text(str, labelX, labelY);
  strokeWeight(1);
}

void drawBoard() {
  displayFlockPattern();
  drawPond();
  drawDucks();
  if (completedFlock()){
   drawLabel("YOU DID IT!",  color(0, fullLight, 0),  color(0, 0, 0)); 
  } else {
    drawLabel("Abducktion",  color(0, 0, 0) ,  color(fullLight, fullLight, fullLight));
  }
}

void drawPond() {
  noFill();
  for (int x = 0; x < width; x += duckWidth) {
    for (int y = 0; y < height; y += duckHeight) {
      rect(x, y, duckWidth, duckHeight);
    }
  }
}

void generateFlockPattern() {
  needA = random(1) > .5;
  needB = random(1) > .5;
  needC = random(1) > .5;
  needD = random(1) > .5;
  needE = random(1) > .5;
  needF = random(1) > .5;
}

void displayFlockPattern() {
  if (needA) {
    drawX(getX("A"), getY("A", false));
  }
  if (needB) {
    drawX(getX("B"), getY("B", false));
  }
  if (needC) {
    drawX(getX("C"), getY("C", false));
  }
  if (needD) {
    drawX(getX("D"), getY("D", false));
  }
  if (needE) {
    drawX(getX("E"), getY("E", false));
  }
  if (needF) {
    drawX(getX("F"), getY("F", false));
  }
}

void drawX(int x, int y) {
  line(x, y, x + duckWidth, y  + duckHeight);
  line(x, y + duckHeight, x + duckWidth, y);
}

void drawDucks() {
  if (A == 0) {
    fill(0, 0, 0);
  } else if (A == 1) {
    fill(0, 0, fullLight);
  } else if (A == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("A");

  if (B == 0) {
    fill(0, 0, 0);
  } else if (B == 1) {
    fill(0, 0, fullLight);
  } else if (B == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("B");

  if (C == 0) {
    fill(0, 0, 0);
  } else if (C == 1) {
    fill(0, 0, fullLight);
  } else if (C == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("C");

  if (D == 0) {
    fill(0, 0, 0);
  } else if (D == 1) {
    fill(0, 0, fullLight);
  } else if (D == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("D");

  if (E == 0) {
    fill(0, 0, 0);
  } else if (E == 1) {
    fill(0, 0, fullLight);
  } else if (E == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("E");

  if (F == 0) {
    fill(0, 0, 0);
  } else if (F == 1) {
    fill(0, 0, fullLight);
  } else if (F == 2) {
    fill(fullLight, 0, 0);
  }
  drawDuckSpot("F");
}

void drawDuckSpot(String spot) {
  int x = getX(spot);
  int y = getY(spot, true);
  int halfDW = duckWidth / 2;
  int halfDH = duckHeight / 2;
  rect(x + halfDW / 2, y + halfDH / 2, duckWidth / 2, duckHeight / 2 );
}

//left X coord of spot
int getX(String spot) {

  if (spot == "A" || spot == "F") {
    return xFA;
  } else if (spot == "B" || spot == "E") {
    return xEB;
  } else {
    return xDC;
  }
}

//topY coord of spot
int getY(String spot, boolean justDuck) {
  if (justDuck) {
    if (spot == "D" || spot == "E" || spot == "F") {
      return topDuckY;
    } else {
      return topDuckY + duckHeight;
    }
  } else {
    if (spot == "D" || spot == "E" || spot == "F") {
      return 0;
    } else {
      return duckHeight;
    }
  }
}

void killAndSwim(String spot) {
  if (spot == "A") {
    //no shift
  } else if (spot == "B") {
    B = A;
  } else if (spot == "C") {
    C = B;
    B = A;
  } else if (spot == "D") {
    D = C;
    C = B;
    B = A;
  } else if (spot == "E") {
    E = D;
    D = C;
    C = B;
    B = A;
  } else if (spot == "F") {
    F = E;
    E = D;
    D = C;
    C = B;
    B = A;
  }

  A = getDuck();
}

void populateSpacePond() {
  A = getDuck();
  B = getDuck();
  C = getDuck();
  D = getDuck();
  E = getDuck();
  F = getDuck();
}

int getDuck() {
  //2 is the biggest duck number, +1 because max is exclusive
  return (int) random(0, 2 + 1);
}

boolean completedFlock() {
  int flag = -1;
  int solidColor = -1;
  if (needA){
     if (solidColor == flag){
        solidColor = A;
     }
  }
  if (needB){
    if (solidColor == flag){
       solidColor = B; 
    } else {
       if (B != solidColor){
          return false; 
       }
    }
  }
  if (needC){
    if (solidColor == flag){
       solidColor = C; 
    } else {
       if (C != solidColor){
          return false; 
       }
    }
  }
  
  if (needD){
    if (solidColor == flag){
       solidColor = D; 
    } else {
       if (D != solidColor){
          return false; 
       }
    }
  }
  
  if (needE){
    if (solidColor == flag){
       solidColor = E; 
    } else {
       if (E != solidColor){
          return false; 
       }
    }
  }
  
  if (needF){
    if (solidColor == flag){
       solidColor = F; 
    } else {
       if (F != solidColor){
          return false; 
       }
    }
  }
  
  return true;
}

void mousePressed() {
  String duckToKill = getSquare(mouseX, mouseY);
  if (duckToKill != "NO DUCK!") {
    killAndSwim(duckToKill);
  }
}

String getSquare(int x, int y) {
  if (y > topDuckY) {
    if (y < topDuckY + duckHeight) {
      //top duck row
      if (x < duckWidth) {
        return "D";
      } else if (x > 2 * duckWidth) {
        return "F";
      } else {
        return "E";
      }
    } else {
      //bottom duck row
      if (x < duckWidth) {
        return "C";
      } else if (x > 2 * duckWidth) {
        return "A";
      } else {
        return "B";
      }
    }
  } else {
    return "NO DUCK!";
  }
}
