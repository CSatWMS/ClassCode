void setup(){
    int tripledValue = triple(4);
    println(tripledValue);
    
    int otherTriple = triple(15);
    println(otherTriple);
    
    float added = addUp(3.14159, 10);
    println(added);
    
    float answer = pythagorean(3, 4);
    println(answer);
    
    float answer2 = pythagorean(5, 12);
    println(answer2);
    
    println(area(3, 4));
    println(perimeter(3, 4));
} //ends the setup function

//GOAL1:Given, l and w, representing length and width, 
  //calculate area of a rectangle
float area(float l, float w){
 float areaCalc = l * w;
 return areaCalc;
}
//GOAL2: same parameters, solve for perimeter
float perimeter(float l, float w){
   return l*2 + w * 2; 
}
  


//GOAL: given a and b, calculate c, using the
    //pythagorean theorem a^2 + b^2 = c^2
float pythagorean(float a, float b){
   //HERE is where you do the calculation
   return sqrt(a*a + pow(b, 2));
}


//GOAL: Add 2 numbers together
float addUp(float a, float b){
   return a + b; 
}


//function signature
//returnType functionName(parameters)
                    //parameters => inputs
                    //dataType variableName

//GOAL: write a function that triples a number
int triple(int x){
    int result = x * 3;
    return result;
}
