void setup(){
  size(500, 500);
  //backgroundScene
    //sky
    background(28, 230, 237);
    //grass
    fill(63, 181, 27);
    rect(0, 400, width, 100);
  
  //house body
  fill(255, 0, 0);
  int houseSize = 200;
  
  int houseX = width/2 - houseSize/2;
  int houseY = height - houseSize;
  
  rect(houseX, houseY, houseSize, houseSize);
  
  //roof
  int rightSideX = houseX + houseSize; //y is the same
  int topX = (houseX + rightSideX) / 2;
  int topY = houseY - houseSize / 2;
  triangle(houseX, houseY, rightSideX, houseY, topX, topY);
  
  
  //accessories
    //door
      fill(65, 6, 34);
      int midHouseX = houseX + houseSize/2;
      int bottomHouseY = houseY + houseSize;
      
      int doorWidth = houseSize / 4;
      int doorHeight = doorWidth * 2;
      
      int doorX = midHouseX - doorWidth / 2;
      int doorY = bottomHouseY - doorHeight;
      rect(doorX, doorY, doorWidth, doorHeight);
      
      int doorKnobX = doorX + doorWidth * 7 / 8;
      int doorKnobY = doorY + doorHeight / 2;
      int doorKnobSize = doorWidth / 5;
      fill(255, 255, 255);
      circle(doorKnobX, doorKnobY, doorKnobSize);
    
    //window
      //oval window
      //centered in house (X)
      //between roofline and door
      int windowX = midHouseX;
      int windowY = (doorY + houseY) / 2;
      int windowWidth = houseSize * 2 / 3;
      int windowHeight = houseSize / 4;
      ellipse(windowX, windowY, windowWidth, windowHeight);
      
      //window pane bars 
      //line(x1, y1, x2, y2)
      int vertPaneX = windowX;
      int topPaneY = windowY - windowHeight / 2;
      int bottomPaneY = windowY + windowHeight / 2;
      line(vertPaneX, topPaneY, vertPaneX, bottomPaneY);
      
      int horizPaneY = windowY;
      int leftPaneX = windowX - windowWidth / 2;
      int rightPaneX = windowX + windowWidth / 2;
      line(leftPaneX, horizPaneY, rightPaneX, horizPaneY);
      
      
    //clouds!
    //cloud(100, 150, 35);
    //cloud(400, 150, 55);
    //cloud(200, 100, 25);
    
    
} //ends setup

void draw(){
  
}

void mouseClicked(){
  //mouseX
  //mouseY
  cloud(mouseX, mouseY, (int)random(20, 70));
}


//GOAL: is to draw one puff of clouds

  //returnType funcName(parameters)
void cloud(int x, int y, int diam){
    int cloudX = x;
    int cloudY = y;
    int cloudDiam = diam;
    noStroke();
    circle(cloudX, cloudY, cloudDiam);
    int offset = cloudDiam / 2;
    circle(cloudX, cloudY - offset, cloudDiam);
    circle(cloudX, cloudY + offset, cloudDiam);
    circle(cloudX - offset*1.5, cloudY, cloudDiam);
    circle(cloudX + offset*1.5, cloudY, cloudDiam);
}
