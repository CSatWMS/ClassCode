void setup(){
  greet("Ms. Snyder");
  greet("Bob");
  
  int result = perimeter(2, 4);
  println(result);
  int result2 = perimeter(3, 5);
  int result3 = perimeter(4, 6);
  println(result + result2 + result3);
  
  float v1 = volume(2, 4);
  println(v1);
  
  float amount = interestCalculator(1000, 0.02);
  println(amount);
  
  
  amount = interestCalculator(amount, 0.02);
  println(amount);
  amount = interestCalculator(amount, 0.02);
  println(amount);
  amount = interestCalculator(amount, 0.02);
  println(amount);
  amount = interestCalculator(amount, 0.02);
  println(amount);
  amount = interestCalculator(amount, 0.02);
  println(amount);
  amount = interestCalculator(amount, 0.02);
  println(amount);
}

void greet(String name){
  println("hello " + name);
}

int perimeter(int h, int w){
    int answer = h*2 + w*2;
    return answer;
}

float volume(int r, int h){
   float V = 3.14*r*r*h;
   return V;
}

float interestCalculator(float initAmount, float interestPerc){
  float interest = initAmount * interestPerc;
  float finalAmount = initAmount + interest;
  return finalAmount;
}
