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
      
      //window pane bars 
      
    //clouds!
  
}  
