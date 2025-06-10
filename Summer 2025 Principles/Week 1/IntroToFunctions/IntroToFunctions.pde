//functions
  //AKA: Methods / Procedures / Named Chunks of Code
//do a task
  //inputs
  //name
  //outputs
  //do something
  
//functions can live here
  
void setup() {
  //built in function -> no parameters, nothing output
  
  //call functions here
  //dataType answerVariable = functionName(inputs);
  int answer = addTogether(3, 4);
  println(answer);
  
  float result = areaOfCircle(3.5);
  println(result);
  
  println(areaOfCircle(3.5));
  println("Area Of A Circle: " + areaOfCircle(3.5));
  println("Area of BIG circle: " + areaOfCircle(2003));
  
  float plusRoot = quadPlusAns(1, 2, -15);
  //float plusRoot2 = quadPlusAns(2, 4, -12);
  println(plusRoot);
  println(quadNegAns(1, 2, -15));
  
  String prettyAnswer = finalQuadSolver(1, 2, -15);
  println(prettyAnswer);
  
} //belongs to setup

//solve the quadratic formula and return a String
  //in the form (root1, root2)
String finalQuadSolver(int A, int B, int C){
   float root1 = quadPlusAns(A, B, C);
   float root2 = quadNegAns(A, B, C);
   String finalAns = "(" + root1 + ", " + root2 + ")";
   return finalAns;
}

float quadNegAns(int A, int B, int C){
   return ( -B - sqrt(B*B - 4*A*C) ) / (2 * A); 
}

float quadPlusAns(int A, int B, int C){
   //solve plus root for quadratric formula
   float underRoot = pow(B, 2) - 4 * A * C;
   float top = -B + sqrt(underRoot);
   float bottom = 2*A;
   return top / bottom;
}

//GOAL: is to calculate the area of a circle, given a radius
float areaOfCircle(float radius){
  float rSquared = radius * radius;
  float area = PI * rSquared;
  return area;
  
  //return PI * pow(radius, 2);
}


//defined a function
int addTogether(int num1, int num2){
  int sum = num1 + num2;
  return sum;
}



//functions can also live here

//general function syntax
//returnType functionName(dataType varName, dataType2 varName2, etc) {
    //solve some problem
    //or
    //do some task
//}

//returnType is the dataType of what we are returning
//functionName describes what the function does
//dataType varName is the parameter (The input to the function)
