void setup(){
   size(500, 281);
   PImage jas = loadImage("jasmine.jpeg");
   background(jas);
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
     
     if (r <= 20 && g <= 20 && b <= 20){
        r = 250;
        b = 250;
        g = 10;
     }
     
     pixels[pixelIndex] = color(r, g, b);
     pixelIndex = pixelIndex + 1; 
  }
  updatePixels();
}
