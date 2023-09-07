float number = 0;
float speed = .005;

void draw(){
  // println("hello"); 
  //println(sin(number));
  println(map(sin(number), -1, 1, 0, 100));
  
  float mappedNumber = map(sin(number), -1, 1, 0, 100);
  float mappedCos = map(cos(number), -1, 1, 0, 100);
  circle(width / 2, mappedNumber, 20);
  circle(mappedCos, height / 2, 20);
  circle(mappedCos, mappedNumber, 20);
  number = number + speed;
  
  
}
