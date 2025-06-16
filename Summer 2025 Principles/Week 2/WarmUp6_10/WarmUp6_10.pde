void setup() {
  //init
  //while (condition)
    //do something
    //update

  /*
  1, 3, 5, 7, 9
   20, 16, 12, 8, 4, 0
   81, 27, 9, 3, 1
   */
  int num = 1;
  while (num < 10){
    if (num % 2 == 1){
      print(num + ", ");
    }
      //num += 2; //num = num + 2;
      num++; //num += 1
  }
  println(); //go down to next line
  int num2 = 20;
  while (num2 >= 0){
    print(num2 + ", ");
    num2 -= 4;
  }
  println();
  int num3 = 81;
  while (num3 > 0){
     print(num3 + ", "); 
     num3 /= 3;
  }
  
}
