void setup(){
   size(550, 366);
   PImage picture = loadImage("platypi.png");
   background(picture);
}

void draw(){
  
}

void mouseClicked(){
  loadPixels();
  //pixels array
  int pixelIndex = 0;
  while (pixelIndex < pixels.length){
     float r = red(pixels[pixelIndex]);
     float g = green(pixels[pixelIndex]);
     float b = blue(pixels[pixelIndex]);
     
     r = 255 - r;
     g = 255 - g;
     b = 255 - b;
     
     pixels[pixelIndex] = color(r, g, b);
     pixelIndex = pixelIndex + 1; 
  }
  updatePixels();
}
