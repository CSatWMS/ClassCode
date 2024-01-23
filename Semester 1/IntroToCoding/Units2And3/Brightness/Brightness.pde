void setup(){
   size(500, 281);
   PImage picture = loadImage("marvel.png");
   background(picture);
}

void draw(){
  
  
}

void mouseClicked(){
  increaseBrightness(0.10);
}

void increaseBrightness(float percentage){
   loadPixels(); //populates the pixels array
   int index = 0;
   while (index < pixels.length){
     float r = red(pixels[index]);
     float g = green(pixels[index]);
     float b = blue(pixels[index]);
     
     println(r + ", " + g + ", " + b);
     
     r = r + r*percentage;
     g = g + g*percentage;
     b = b + b*percentage;
     
     pixels[index] = color(r, g, b);
     
     index = index + 1;
   }
   
   
   updatePixels();
}
