void setup(){
  int answer = areaOfRect(3, 5);
  println(answer);
  println(areaOfRect(4, 6));
  
  println(perim(4.2, 5));
  
  float faren = tempConvert(100);
  println(faren);
  
  float amount = interest(1000, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  amount = interest(amount, .2);
  println(amount);
  size(300, 300);
  fillQuadrants(#123456, #654321, #AABBCC, #CAFE12);
}

//GOAL: find the area of a rectangle
  //parameters: length and myWidth
  //return Type?
int areaOfRect(int len, int wid){
  int area = len*wid;
  return area;
}

//GOAL: find the perimeter of a rectangle
  //handle decimals
float perim(float l, float w){
  float result = l*2 + w*2;
  return result;
}

//Temperature Converter
  // Celsius -> Farenheit
float tempConvert(float tempInC){
  return (9.0 / 5.0) * tempInC + 32;
}

//Interest Calculator
float interest(float initAmount, float interestPercentage){
  float interestAmount = initAmount * interestPercentage;
  return interestAmount + initAmount;
}


void fillQuadrants(color c1, color c2, color c3, color c4){
   //rect(x, y, w, h)
   fill(c1);
   rect(0, 0, width / 2, height / 2);
   
   fill(c2);
   rect(0, height / 2, width / 2, height / 2);
   
   fill(c3);
   rect(width / 2, 0, width/2, height /2 );
   
   fill(c4);
   rect( width/2, height /2 , width/2, height /2 );
}
