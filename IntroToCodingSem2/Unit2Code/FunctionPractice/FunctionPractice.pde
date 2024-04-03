void setup() {
    int answer = addTogether(2, 5);
    println(answer);
    
    println(addTogether(3, 10));
    
    println(areaTri(10, 10));
  
} //this curly belongs to setup

//calculate the area of a triangle
//with a base and height (A = .5BH)
float areaTri(float base, float hei){
   return .5 * base * hei; 
}

//write a function that takes in 2 ints, 
//adds them together, and returns the sum
int addTogether(int num1, int num2){
  int sum = num1 + num2;
  return sum;
  
  //return num1 + num2;
}
