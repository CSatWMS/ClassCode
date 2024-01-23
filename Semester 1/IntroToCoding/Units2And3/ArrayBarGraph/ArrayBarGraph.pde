int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
int biggestFriend = 90;
//int biggestFriend = numbers[numbers.length - 1];

color[] colors = new color[numbers.length];

void setup(){
   int index = 0;
   while (index < 4) {
      println(numbers[index]);
      index = index + 1; 
   }
   size(100, 100);
   technoColor();
}

void mouseClicked(){
   technoColor(); 
}

void technoColor(){
  int colorIndex = 0;
   while (colorIndex < colors.length){
       float r = random(0, 255);
       float g = random(0, 255);
       float b = random(0, 255);
       
       colors[colorIndex] = color(r, g, b);
     
       colorIndex = colorIndex + 1;
   }
}

void draw(){
   int i = 0;
   float h = (float) height / numbers.length;
   int blueValue = 0;
   while (i < numbers.length){
      //fill(0, 0, blueValue);
      fill(colors[i]);
      int friend = numbers[i]; 
      friend = (int) map(friend, 0, biggestFriend, 0, width);
      rect(0, i*h, friend, h);
      
      i = i + 1;
      blueValue = blueValue + (255 / numbers.length);
   }
}
