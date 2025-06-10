void setup(){
  int age = 33;
  int yearBorn = 2025 - age;
  println(yearBorn);
  println(age);
  println("Hello");
  char first = 'C';
  char last = 'S';
  String name = "Christina Snyder";
  print("My name is ");
  println(name);
  //concatenation (glueing Strings together)
    // +
  println("My name is " + name);
  println("My age is " + age);
  println(age + yearBorn);
  println("abc" + age + yearBorn);
  println("abc" + (age + yearBorn));
  println(first + last);
  println(67 + 83);
  println("" + first + last);
  println(first + "" + last);
  println(1 + 2 + "X" + 1 + 2);
  
  float tau = 6.28;
  //int broken = 6.28; ints are only whole numbers
  float okay = 4;
  println(okay);
  
  float fourTau = tau * 4;
  float halfTau = tau / 2;
  //float tauSquared = tau ^ 6; // ^ is the bitwise XOR operator
  
  //pow
    //float answer = pow(base, exponent);
  float tauSquared = pow(tau, 2);
  
  float tauRoot = pow(tau, .5);
  //sqrt
    //float answer = sqrt(value);
  tauRoot = sqrt(tau); // no data type needed
  
  
  //modulus => remainder operator => %
  
  println(27 % 5);
  println(27 % 4);
  println(27 % 3);
  println(10 % 2);
  println(2 % 10);
  println(17 % 39);
  //Rule: small % big = small
  println(39 % 17);
  
  
  int len = 4;
  int wid = 6;
  //create, calculate, and print
    //area and perimeter of this rectangle
    //area = l * w
    //perimeter = twice l + twice w
  int area = len * wid;
  int perimeter = len * 2 + wid + wid;
  println("Area: " + area);
  println("Perimeter: " + perimeter);
  
  float radius = 3.5;
  //create, calculate, and print
    //area and perimeter of this circle
  println(PI);
  float areaOfCircle = PI * pow(radius, 2);
  float circumference = 2 * PI * radius;
  println("Circ Area: " + areaOfCircle);
  println("Circumference: " + circumference);
  
  
  //a^2 + b^2 = c^2
  int A = 3;
  int B = 4;
  //algorithm = sequence of steps
  int aSquared = A * A;
  float bSquared = pow(B, 2);
  float underRoot = aSquared + bSquared;
  float C = sqrt(underRoot);
  println("C: " + C);
  float complicated = sqrt( pow(A, 2) + pow(B, 2) );
  println("C: " + complicated);
  
  circle(10, 10, 10);
  
  
  
}
