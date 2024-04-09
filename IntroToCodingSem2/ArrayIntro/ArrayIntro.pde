void setup(){
    int[] arr = {7, 3, 5, 1};
    int first = arr[0];
    println("First: " + first);
    int numberOfElements = arr.length;
    println("Total: " + numberOfElements);
    int last = arr[3];
    int lastValue = arr[numberOfElements - 1];
    
    println(arr[0]);
    println(arr[1]);
    println(arr[2]);
    println(arr[3]);
    
    int location = 0;
    while (location < arr.length){
      println(arr[location]);
      location = location + 1;
    }
    
    
}
