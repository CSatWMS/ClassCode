IntList list = new IntList();
int y = 0;
void setup(){
   int numSquares = 100;
   for (int i =0; i < numSquares; i++){
      list.append(0); 
   }
   //set the middle spot to 1
   list.set(numSquares / 2 , 1);
   size(400, 400);
   drawSquares(list, 0);
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

void draw(){
  
}

void keyPressed(){
  int size = width / list.size();
  y += size;
  list = predictTheFuture(list);
  drawSquares(list, y);
}

IntList predictTheFuture(IntList original){
    IntList futureList = new IntList();
    for (int i = 0; i < original.size(); i++){
        int me = original.get(i);
        int leftIndex = i - 1;
        if (i == 0){
           leftIndex = original.size() - 1; 
        }
        int left = original.get(leftIndex);
        int rightIndex = i + 1;
        if (rightIndex == original.size()){
            rightIndex = 0;
        }
        int right = original.get(rightIndex);
        
        int result = aliveOrDead(left, me, right);
        futureList.append(result);
    }
    return futureList;
}

int aliveOrDead(int left, int me, int right){
    if (left ==1 && me == 1 && right == 1){
       return 0; 
    } 
    if (left ==0 && me == 1 && right == 1){
       return 1; 
    } 
    if (left ==1 && me == 0 && right == 1){
       return 1; 
    } 
    if (left ==0 && me == 0 && right == 1){
       return 0; 
    } 
    if (left ==1 && me == 1 && right == 0){
       return 1; 
    } 
    if (left ==0 && me == 1 && right == 0){
       return 1; 
    } 
    if (left ==1 && me == 0 && right == 0){
       return 1; 
    } 
    if (left ==0 && me == 0 && right == 0){
       return 0; 
    }
    
    return -1000; //should never happen
}
