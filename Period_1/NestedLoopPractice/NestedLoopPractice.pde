void setup() {
  for (int repeat = 0; repeat < 5; repeat++) {
    for (int i = 0; i < 5; i++) {
      print("*");
    }
    println();
  }
  println("--------");
  for (int lineCounter = 0; lineCounter < 5; lineCounter++){
    for (int starCounter = 0; starCounter < lineCounter + 1; starCounter++){
       print("*"); 
    }
    println();
  }
  println("--------");
  
  for (int lineCounter = 0; lineCounter < 5; lineCounter++){
    for (int starCounter = 5; starCounter > lineCounter; starCounter--){
      print("*");
    }
    println();
  }
  println("--------");
  
  for (int lineCounter = 5; lineCounter > 0; lineCounter--){
    for (int starCounter = 0; starCounter < lineCounter; starCounter++){
      print("*");
    }
    println();
  }
  
}
