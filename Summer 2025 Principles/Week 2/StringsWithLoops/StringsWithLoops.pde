void setup(){
  String word = "pizza";
  int numLetters = word.length();
  println(word.charAt(0));
  println(word.charAt(1));
  println(word.charAt(2));
  println(word.charAt(3));
  println(word.charAt(4));
  
  //for (init ; stop condition ; update)
  for (int index = 0; index < word.length(); index++){
      println(index + ": " + word.charAt(index));
  }
  
  // a z z i p
  //print pizza backwards
  for (int index = word.length() - 1; index >= 0; index--){
     print(word.charAt(index) + " "); 
  }
  println();
  
  noHaters(word, 'z');
  noHaters(word, 'p');
  noHaters(word, 't');
  
  println(countSpecial("pizza", 'z'));
  println(countSpecial("pizza", 'p'));
  println(countSpecial("pizza", 't'));
  
}

//GOAL: I want to take in a String and HATED letter
  //print every letter that is NOT the HATED letter
    // noHaters("pizza", 'z') -> pia
    // noHaters("pizza", 'p') -> izza
    // noHaters("pizza", 't') -> pizza
void noHaters(String word, char hatedLetter){
    for (int index = 0; index < word.length(); index++){
        char currentLetter = word.charAt(index);
        if (currentLetter != hatedLetter){
          print(currentLetter + " ");
        }
    }
    println();
}

//GOAL: Count how many times a special letter appears
    // countSpecial("pizza", 'z') -> 2
    // countSpecial("pizza", 'p') -> 1
    // countSpecial("pizza", 't') -> 0
int countSpecial(String word, char special){
    int count = 0;
    for (int index = 0; index < word.length(); index++){
        char currentLetter = word.charAt(index);
        if (currentLetter == special){
           //hooray! 
           count ++;
        }
    }
    return count;
}

//GOAL: count the number of vowels (aeiou) in a string
  // countVowels("pizza") -> 2
  // countVowels("aeiouaeiou") -> 10
  // countVowels("bcd") -> 0
int countVowels(String word){
   //init counter
   int count = 0;
   //loop
   for (int index = 0; index < word.length(); index++){
     //grab current letter
     char currentLetter = word.charAt(index);
     //if that letter is a vowel
     if (currentLetter == 'a' || currentLetter == 'e'
           || currentLetter == 'i' || currentLetter == 'o'
             || currentLetter == 'u'){
       //udpate count
       count++;
     }
   }
   return count; //return the answer
}
