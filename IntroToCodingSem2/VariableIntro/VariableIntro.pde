//a variable is a way to store (or remember) information
//circle(x, y, size);

//general syntax
//dataType variableName = value;
  //staticaly or dynamically typed
  //dataType options:
    //int (stands for Integer, it's a whole number)
    //float (stands for Floating Point Number
              //these can have decimals
    //char (stands for Character, hold a single letter)
    //String (starts with Capital S, holds words or phrases)
    
int numSiblings = 4;
float shoeSize = 9.5;
char myGrade = 'A';
String myName = "Christina Elvira Snyder";

void setup() {
  println(numSiblings);
  println(shoeSize);
  println(myGrade);
  println(myName);
  
  int number = 7;
  println(number + 5);
  number = number + 5;
  println(number);
  
  number = number - 10;
  println(number);
  
  number = number * 8;
  println(number);
  
  number = number / 3;
  println(number);
  //truncation happens when I divide two whole numbers
  println(9/10);
  float test = 9/10;
  println("9/10 is " + test);
  float test2 = 9.0 / 10;
  float test3 = 9 / 10.0;
  float test4 = 9.0 / 10.0;
  println("9.0 / 10 is " + test2);
  println("9 / 10.0 is " + test3);
  println("9.0 / 10.0 is " + test4);
}

    
    
    
