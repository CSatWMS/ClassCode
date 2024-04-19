color[] flowerPixels;

void setup(){
   size(500, 667);
   PImage img = loadImage("jelly.jpeg");
   PImage flowerImg = loadImage("flower.jpeg");
   background(flowerImg);
   loadPixels();
   flowerPixels = new color[pixels.length];
   arrayCopy(pixels, flowerPixels);
   
   
   background(img);
}

void mouseClicked(){
  printPixel(mouseX, mouseY);
  //redSea();
  flowers();
}

void flowers(){
  loadPixels();
  int index = 0;
  while (index < pixels.length){
     //do something
       //replace blue pixels with flower pixels
     color currentPixel = pixels[index];
       //is this pixel BLUE?
       if (red(currentPixel) < 60 &&
             green(currentPixel) < 110 &&
               blue(currentPixel) > 90){
               //  println("BLUE");
            pixels[index] = flowerPixels[index];
       }
     index = index + 1;
  }
  updatePixels();
}

//GOAL: Turn blue pixels to red
void redSea(){
    loadPixels(); //gives me access to the pixels array
    int index = 0;
    while (index < pixels.length){
       color currentPixel = pixels[index];
       //is this pixel BLUE?
       if (red(currentPixel) < 60 &&
             green(currentPixel) < 110 &&
               blue(currentPixel) > 90){
                 //pixels[index] = 
                 pixels[index] = color(255 * (index * 1.0 / (width* height)), 0, 0);
               }
       index = index + 1;
    }
    updatePixels();
}

void printPixel(int x, int y){
    loadPixels();
    int pixelLocation = y * width + x;
    color currentPixel = pixels[pixelLocation];
    float redPart = red(currentPixel);
    float greenPart = green(currentPixel);
    float bluePart = blue(currentPixel);
    println(redPart + ", " + greenPart + ", " + bluePart);
    
}

void draw(){
  
}
