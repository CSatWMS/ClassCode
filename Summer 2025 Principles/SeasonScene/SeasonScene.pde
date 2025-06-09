int number = 0;
String season = "SUMMER";
int textPosition = 0;
void setup() {
  size(800, 600);
}
void draw() {
  int timeOfDay = 5;
  int numClouds = 2;
  //Anything else you may need here
  drawSky(season, timeOfDay);
  //drawClouds(numClouds);
  //drawLandscape(season, timeOfDay);
  //drawTrees(season);
  //drawSomeItem();
  number = number + 1;
  if (number > 255){
     number = 0; 
     if (season == "SUMMER"){
        season = "FALL"; 
     } else if (season == "FALL"){
        season = "WINTER"; 
     }
  }
  changeColor(number);
  stroke(255, 255, 255);
  textPosition = textPosition + 1;
  text(season, textPosition, height / 2);
}
void drawSky(String season, int timeOfDay) {
  //What happens in the sky, particularly at a time of day?
  if (timeOfDay < 6) {
    drawNightSky();
  } else if (timeOfDay < 10) {
    //drawSunriseSky();
  } else if (timeOfDay < 18) {
    //drawDaytimeSky();
  } else if (timeOfDay < 20) {
    //drawSunsetSky();
  } else {
    //drawNightSky();
  }
  //What happens specifically in the sky, specifically in a
  //particular season?
  if (season == "SUMMER") {
    //drawBird();
  } else if (season == "WINTER") {
    //drawSnowflakes();
  } else if (season == "SPRING") {
    //drawPollen();
  } else {
    //drawBlimp();
  }
} //closes drawSky

void drawNightSky(){
   background(23, 4, 36); 
   fill(237, 226, 190);
   circle(650, 100, 75);
}

void changeColor(int red){
    background(red, 0, 0);
}
