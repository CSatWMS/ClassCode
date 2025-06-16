boolean clickedQuad1 = false; //global variable
boolean clickedQuad2 = false;
boolean clickedQuad3 = false;
boolean clickedQuad4 = false;
void setup() {
  size(500, 500);
}

void draw() {
  background(0);
  if (clickedQuad1 || mouseX < width / 2 && mouseY < height /2 ) {
    fill(255);
    rect(0, 0, width/2, height/2);
    //int x = 15;
  }
  if (clickedQuad2 || mouseX > width / 2 && mouseY < height /2 ) {
    fill(255, 0, 0);
    rect(width/2, 0, width/2, height/2);
  }
  if (clickedQuad3 || mouseX < width / 2 && mouseY > height /2 ) {
    fill(0, 255, 0);
    rect(0, height/2, width/2, height/2);
  }
  if (clickedQuad4 || mouseX > width / 2 && mouseY > height /2 ) {
    fill(0, 0, 255);
    rect(width/2, height/2, width/2, height/2);
  }
  //println(x);
}


void mouseClicked() {
  if (mouseX < width / 2 && mouseY < height /2 ) {
    clickedQuad1 = true;
  }
  if (mouseX > width / 2 && mouseY < height /2 ) {
    clickedQuad2 = true;
  }
  if (mouseX < width / 2 && mouseY > height /2 ) {
    clickedQuad3 = true;
  }
  if (mouseX > width / 2 && mouseY > height /2 ) {
    clickedQuad4 = true;
  }
}
