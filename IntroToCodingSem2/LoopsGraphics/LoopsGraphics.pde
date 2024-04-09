void setup(){
   size(600, 400); 
   /*
   int x = 50;
   while (x < width){
     circle(x, height / 2, 100);
     x = x + 120;
   }
   */
   /*
   int y = 50;
   while (y < height){
      circle(width / 2, y, 100);
      y = y + 100;
   }
   */
   //growCircles(10, height / 2, 10);
   //rowOfCircles(100);
   //rowOfCircles(350);
   fillScreen();
}

//GOAL: fill the whole screen with circles
void fillScreen(){
   int y = 50;
   while (y < height){
      rowOfCircles(y);
      y = y + 100;
   }
}

//GOAL: write a function that takes in a y value, and makes
  //A row of circles
void rowOfCircles(int y){
  int x = 50;
  while (x < width){
    circle(x, y, 100);
    x = x + 100;
  }  
}  

//GOAL: Write a function, with a starting x, y, and size
  //move right, getting bigger over time
void growCircles(int x, int y, int size){
  while (x < width){
   circle(x, y, size); 
   size = size * 3 / 2;
   x = x + size;
  }
   
}
