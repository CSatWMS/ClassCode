void setup(){
  //void -> return data Type
    //void means there is no answer
  //setup -> function name
  //  () -> parameter area
  // { } -> contents of a function go inside curly brackets
  
  int answer = add(3, 7);
  println(answer);
  
  int answer2 = cube(4);
  println(answer2);
  
  println(PI);
  float areaAnswer = areaCircle(2);
  println(areaAnswer);
  
  int area2 = rectArea(3, 5);
  println(area2);
  int area3 = rectArea(10, 15);
  println(area3);
  
  int perimAnswer = rectPerim(3, 5);
  println(perimAnswer);
  
} //this curly belongs to setup

//GOAL: Calculate 'c' using the pythagoream theorem


//GOAL: calculate the perimeter of a rectanlge
int rectPerim(int len, int wid){
   int perim = len *2 + wid*2;
   int otherPerim = len + len + wid + wid;
   return perim;
}

//GOAL: calculate the area of a rectangle
int rectArea(int len, int wid){
   int area = len * wid;
   return area;
}

//GOAL: calculate the area of a circle
float areaCircle(float radius){
   float area = PI * radius * radius;
   return area;
}

//GOAL: write a function, called cube
    //that takes in a single integer
    //and returns that number, cubed
int cube(int number){
   int cubedAnswer = number * number * number;
   return cubedAnswer;
}


//GOAL: to take in two numbers, 
  //add them together,   
  //return the result

//general function syntax:
//returnDataType funcName(dataType1 param1, dataType2 param2, etc)
int add(int num1, int num2){
   int sum = num1 + num2;
   return sum;
}
