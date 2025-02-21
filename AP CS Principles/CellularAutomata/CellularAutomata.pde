IntList list = new IntList();

void setup(){
   int numSquares = 10;
   for (int i =0; i < numSquares; i++){
      list.append(0); 
   }
   //set the middle spot to 1
   list.set(numSquares / 2 , 1);
   size(400, 400);
   drawSquares(list, 50);
}

void drawSquares(IntList list, int y){
   int size = width / list.size();
   int x = 0;
   for (int i =0; i < list.size(); i++){
     if (list.get(i) == 1){
        fill(0); 
     } else {
        fill(255); 
     }
     rect(x, y, size, size);
     x = x + size;
   }
  //x + size
  //rect(x, y, size, size);
}
