void setup() {
  StringList words = new StringList("Sticky", "Pen", "iPad", "Mug");
  int numWords = words.size();
  println(numWords);
  printOnLine(words);

  printAboveThreshold(words, 3); // -> Sticky iPad
  printAboveThreshold(words, 4); // -> Sticky

  println(countLength(words, 3));

  println(glueTogether(words));

  FloatList numbers = generateList(5);
  println(numbers);
  println(sumTotal(numbers));
  println(average(numbers));
  println(findMax(numbers));
}

//GOAL: is to return the largest value in a FloatList
  //largest, biggest, maximum, tallest
float findMax(FloatList list){
    float stickyNote = list.get(0); //NOT zero itself
    for (int i = 0; i < list.size(); i++){
       float currNumber = list.get(i);
       if (currNumber > stickyNote){
          stickyNote = currNumber;
       }
    }
    return stickyNote;
}

//Aggretation Algorithm
  //initialize some basket
  //loop
    //may or may not test the currValue
      //update the basket
  //return the basket

//GOAL: return the average of the positive numbers in a FloatList
// average = the sum of numbers / number of numbers
float average(FloatList list) {
  float basket = 0;
  int count = 0;
  for (int i = 0; i < list.size(); i++){
     float currNumber = list.get(i);
     if (currNumber > 0){
         basket += currNumber;
         count++;
     }
  }
  return basket / count;
}

//GOAL: given a FloatList, return the sum of that list
float sumTotal(FloatList list) {
  float basket = 0;
  for (int i = 0; i < list.size(); i++) {
    float currNumber = list.get(i);
    basket = basket + currNumber;
    //basket += list.get(i);
  }
  return basket;
}

//GOAL: Print each word on its own line
void printOnLine(StringList text) {
  for (int i = 0; i < text.size(); i++) {
    String currWord = text.get(i);
    println(currWord);
  }
}

//GOAL: Print out words, but ONLY if their length() is
// longer than the threshold

//   printAboveThreshold(words, 3); // -> Sticky iPad
//   printAboveThreshold(words, 4); // -> Sticky
void printAboveThreshold(StringList text, int minimumLength) {
  for (int i = 0; i < text.size(); i++) {
    String currWord = text.get(i);
    if (currWord.length() > minimumLength) {
      print(currWord + " ");
    }
  }
  println();
}

//GOAL: return the count of the number of words
// with exactly the specified length
// countLength(words, 3) -> 2
// countLength(words, 4) -> 1
// countLength(words, 7) -> 0
int countLength(StringList text, int numLetters) {
  //1
  int count = 0;
  for (int i = 0; i < text.size(); i++) {
    //2
    String currWord = text.get(i);
    if (numLetters == currWord.length()) {
      count++;
    }
    //3
  }
  //4
  return count;
}

//GOAL: is to collect (and return) all the words in my list
//in one single, big String
String glueTogether(StringList text) {
  String basket = "";
  for (int i = 0; i < text.size(); i++) {
    String currWord = text.get(i);
    basket = basket + currWord; //basket += currWord;
  }
  return basket;
}

//GOAL: Return a FloatList that contains n random numbers
//between -10 and 10
FloatList generateList(int n) {
  //init list
  FloatList list = new FloatList();
  //loop n times
  for (int x = 0; x < n; x++) {
    //populate list with random numbers
    float number = random(-10, 10);
    list.append(number);
  }
  //return list
  return list;
}
