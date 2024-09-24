//function declaration
int addTogether(int number1, int number2){
  int sum = number1 + number2;
  return sum;
}

double squareIt(double number){
  double answer = number * number;
  return answer;
}

void squareWithX(int x, int y){
   rect(x, y, 100, 100);
   line(x, y, x + 100, y + 100);
   line(x + 100, y, x, y + 100);
}

void flag(int x, int y){
  
}

void setup(){
  //Function calls
  int result = addTogether(5, 3);
  println(result);
  
  int result2 = addTogether(4, 5);
  println(result2);
  
  double squared = squareIt(5.2);
  println(squared);
  
  size(600, 600);
  squareWithX(20, 20);
  squareWithX(200, 200);
  squareWithX(300, 100);
}
