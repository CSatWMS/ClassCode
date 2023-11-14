void setup(){
  int[] arr = {7, 5, 1, 8, 2};
  
  int numOfNums = arr.length;
  println(numOfNums);
  
  int firstNumber = arr[0];
  println(firstNumber);
  
  int lastNumber = arr[4];
  println(lastNumber);
  
  int betterLastNumber = arr[arr.length - 1];
  println(betterLastNumber);
  
  int middleNumber = arr[arr.length / 2];
  println(middleNumber);
  
  //test truncation rules
  println(5 / 2);
  println(5.0 / 2);
  println(5 / 2.0);
  
  int a = 5 / 2;
  println(a);
  
  //int b = 5.0 / 2;
  //println(b);
  
  println(arr);
  
  arr[1] = 3007;
  println(arr);
  
  print(arr);
}
