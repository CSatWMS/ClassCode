void setup(){
    boolean[] bools = {false, true, true, false};
    int numElements = bools.length;
    boolean firstGuy = bools[0];
    boolean lastGuy = bools[numElements - 1];
    println(bools);
    //initialize (starting point)
    //while (condition) (stopping point)
      //do something
      //update the variable
    int index = 0;
    while (index < bools.length){
        boolean currentGuy = bools[index];
        if (currentGuy == true){
          println(currentGuy + " @ position " + index);
        }
        index = index + 1;
    }
}
