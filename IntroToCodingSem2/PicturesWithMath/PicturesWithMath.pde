void setup(){
   size(500, 667);
   PImage img = loadImage("fish.jpeg");
   background(img);
}

void draw(){
  
}

void mouseClicked(){
  negate();
}

void negate(){
    loadPixels();
    int index = 0;
    while (index < pixels.length){
      color current = pixels[index]; 
      float red = red(current);
      float green = green(current);
      float blue = blue(current);
      
      red = 255 - red;
      green = 255 - green;
      blue = 255 - blue;
      
      pixels[index] = color(red, green, blue);
      index = index + 1;
    }
    updatePixels();
}
