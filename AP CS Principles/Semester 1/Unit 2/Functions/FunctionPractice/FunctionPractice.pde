// returnType funcName(inputs){   }

void setup(){
  //happens once
  sayHello();
  sayHello();
  sayHello();
  
  greet("Ms. Snyder");
  greet("Bobby");
  greet("rachel");
  
  names("Christina", "Snyder");
  names("Snyder", "Christina");
  names("ABC", "XYZ");
  
  likesSentence("Ms. Snyder", "Board Games", "Cheese");
  siblings(2, 2);
  
  float answer = multiply(12.5, 3.3);
  println(answer);
  println(multiply(2, 5));
}

void draw(){
  //happens repeatedly
  //sayHello(); //says hello world over and over and over again
}

//GOAL: Say/Print hello, World
void sayHello(){
   println("Hello, World!"); 
}

//GOAL: have the computer greet a person
  //take in a name
    //  Hello, <NAME>
void greet(String name){
  println("Hello " + name); //concatenation (glue strings and variables)
}

//GOAL: List firstnames and lastnames
  //print like this:
      //First Name: Christina
      //Last Name: Snyder
void names(String firstName, String lastName){
  println("First Name: " + firstName);
  println("Last Name: " + lastName);
}


//GOAL: write a function with three parameters
  //first name
  //a like
  //a dislike
    //Ms. Snyder likes board games, but dislikes cheese
void likesSentence(String name , String like , String dislike){
    println(name + " likes " + like + " but dislikes " + dislike);
}

//GOAL: write a sentence about siblings
  //take in the number of sisters
  //the number of brothers
    //I have <2> sisters and <2> brothers, for a total <4> siblings
void siblings(int numSisters , int numBrothers){
    int numSiblings = numSisters + numBrothers;
    println("I have " + numSisters + " sisters and " + numBrothers +
          " brothers for a total of " + numSiblings + " siblings");
}

//GOAL: multiply two numbers together, return the product
float multiply(float num1, float num2){
  float product = num1 * num2;
  return product;
}
