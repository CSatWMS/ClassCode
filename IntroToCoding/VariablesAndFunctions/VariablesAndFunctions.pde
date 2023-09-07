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
   
   
}
