void setup() {
  size(800, 600);
  int timeOfDay = 5;
  String season = "SUMMER";
  int numClouds = 2;
  //Anything else you may need here

  drawSky(season, timeOfDay);
  //drawClouds(numClouds);
  //drawLandscape(season, timeOfDay);
  //drawTrees(season);
  //drawSomeItem();
}

void draw() {
}

void drawSky(String season, int timeOfDay) {
  //What happens in the sky, particularly at a time of day?
  if (timeOfDay < 6) {
    drawNightSky(); //This will error at first. We will fix it as a class
  } else if (timeOfDay < 10) {
    //drawSunriseSky();
  } else if (timeOfDay < 18) {
    //drawDaytimeSky();
  } else if (timeOfDay < 20) {
    //drawSunsetSky();
  } else {
    //drawNightSky();
  }

  //What happens specifically in the sky, specifically in a particular season?
  if (season == "SUMMER") {
    //drawBird();
  } else if (season == "WINTER") {
    //drawSnowflakes();
  } else if (season == "SPRING") {
    //drawPollen();
  } else {
    //drawBlimp();
  }
}

void drawNightSky(){
  fill(29, 7, 138);
  rect(0, 0, width, height * 2 / 3);
  fill(248, 250, 202);
  circle(100, 50, 100);
  drawStars();
}

void drawStars(){
  drawStar((int) random(0, width), (int) random(0, height * 2 / 3));
  drawStar((int) random(0, width), (int) random(0, height * 2 / 3));
  drawStar((int) random(0, width), (int) random(0, height * 2 / 3));
  drawStar((int) random(0, width), (int) random(0, height * 2 / 3));
}

void drawStar(int x, int y){
   fill(255);
   circle(x, y, 5);
}
