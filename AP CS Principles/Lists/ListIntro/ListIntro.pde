void setup(){
   IntList nums = new IntList();
   nums.append(7);
   nums.append(3);
   nums.append(5);
   println(nums);
   int len = nums.size();
   println(len);
   //ELEMENT -> a thing in your list
   //Index -> A location of an element in your list
   
   //access elements -> .get(index) 
   int first = nums.get(0);
   println(first);
   int last = nums.get(2);
   println(last);
   int betterLast = nums.get(nums.size() - 1);
   println(betterLast);
   
   //change or update my elements
     //.set(index, newThing)
   nums.set(0, 300);
   println(nums);
   
   //delete something 
     //.remove(index) -> return the removed thing
   int oldThing = nums.remove(0);
   println(oldThing);
   println(nums);
   
   int test = nums.remove(1);
   println("test: " + test);
   println(nums);
   
   IntList test6 = new IntList();
   test6.append(6);
   test6.append(2);
   test6.append(7);
   println("Test 6s: " + firstLast6(test6));
   
}

boolean firstLast6(IntList list){
    if (list.get(0) == 6){
       return true; 
    } else if (list.get(list.size() - 1) == 6){
       return true; 
    } else {
       return false;
    }  
}
/*
boolean sameFirstLast(IntList list){
  
}

boolean commonEnd(IntList a, IntList b){
  
}

IntList rotateLeft3(IntList list){
  
}

IntList reverse3(IntList list){
  
}
*/
