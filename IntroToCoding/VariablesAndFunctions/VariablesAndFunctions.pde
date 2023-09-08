void setup(){
   //variable initialization
   //dataType varName = value;
   /*
   Data Types
   
   primitive types below
   int (whole numbers)
   float (decimals)
     other number types: double, long, short, byte
   boolean (true / false)
   char (single letters) (single quotes 'A')
   
   reference type (object type) 
   String (text written in double quotes "hello")
   */
   
   /*
   Variable Naming Rules and Conventions
   Rule-> something we MUST do
     1. No Spaces
     2. No Reserved words (coding words) (void, int, float)
         QUESTION: can setup and draw be varNames?
     3. AlphaNumeric (var names can be made of letters and numbers (_))
     4. Cannot start with a number 
   
   Convention-> a hard suggestion (but technically not required)
     1. Deal with the no space thing
       a. camelCaseWhereYouCapitalizeTheFirstLetter
       b. use_underscores_as_spaces
     2. Descriptive
     3. Start with a lowercase letter
   */
   
   String firstName = "Christina";
   println(firstName);
   
   //text(firstName, 10, 10);
   
   int numStudents = 8;
   println("The number of students is " + numStudents);
   //^ concatenation (fancy glue together)
   
   float gpa = 98.2;
   println(gpa + " is my gpa");
   
   boolean hasDogs = true;
   println(hasDogs);
   
   //1. Make vars for length/width
   int myWidth = 6;
   int myLength = 4;
   //2. Calculate area/perimeter
   int area = myWidth * myLength;
   int perimeter = myWidth*2 + myLength*2;
   //3. Fancy print statement
   println("area: " + area);
   println("perimeter: " + perimeter);
   
   
   float root = sqrt(49);
   println(root);
   
   //make a and b (3 and 4)
   //calculate c
   //print out your answer
   
   int a = 3;
   int b = 4;
   int aSquared = a * a;
   int underTheRoot = aSquared + b*b;
   float c = sqrt(underTheRoot);
   println(c);
   
   
   //^ is not exponents! (It's the bitwise XOR)
   //pow(base, exponent)
     //2^4 -> pow(2, 4)
     //pow(number, .5)
     
  float sixteen = pow(4, 2);
  
  float R = 2;
  float S = 5;
  float T = -12;
  
  //calculate your two roots
  float fourRT = 4 * R * T;
  float rootPart = sqrt(S*S - fourRT);
  float posTop = -S + rootPart;
  float negTop = -S - rootPart;
  float posAns=posTop/(2*R);
  float negAns = negTop / (2 * R);
  println("(" + posAns + ", " + negAns + ")");
  
  //calculate the area of a triangle
  
  
  
   
}
