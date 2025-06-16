void setup(){
   String word = "empanada";
   println(word);
   println("My favorite food is: " + word); //concatenation
   //methods 
     //DT result = var.methodName(params)
   
   //.length() -> returns number of letters
   int numLetters = word.length();
   println(numLetters);
   
   //location of a letter is called an index
     //indexes start at 0
     
   //.charAt(index) -> returns the character at that location
   char first = word.charAt(0);
   println(first);
   char last = word.charAt(7);
   println(last);
   char lastLetter = word.charAt(word.length() - 1); //this works for any String
   println(lastLetter);
   
   //.substring(start, stop) 
     //gives multiple letters (String)
     //start is inclusive
     //stop is exclusive (go up to, but not include the stopping point)
   String mystery = word.substring(1, 4);
   println(mystery);
   String mystery2 = word.substring(4, 8);
   println(mystery2);
   //String willERROR = word.substring(4, 9);
   String firstHalf = word.substring(0, word.length() / 2);
   println(firstHalf);
}
