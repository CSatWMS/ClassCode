import javax.swing.JOptionPane;

void setup() {
  int x = 0;
  while (x < 10) {
    print(x);
    x = x + 1; //the update step does not need a data type
  }


  println("It's 1687 and you are a vampire hunter in Transylvania");
  String name = JOptionPane.showInputDialog("What is your name?");
  println("Hello, " + name + ", Why do you want to hunt vampires?");
  String motivation = JOptionPane.showInputDialog("Do you hunt for 'Hate' or 'Science'?");
  //inputChecker
  while ( !motivation.equals("Hate") && !motivation.equals("Science") ) {
    println(motivation + " is an invalid option");
    println("Your options were 'Hate' or 'Science'");
    //println(motivation);

    motivation = JOptionPane.showInputDialog("Do you hunt for 'Hate' or 'Science'?");
  }

  println("You chose: " + motivation);
  if (motivation.equals("Science")) {
    //ask about flight or immortality
    ILoveScience();
  } else if (motivation.equals("Hate")) {
    //deal with that
  } else {
    println("Invalid Option");
    println("Your options were 'Hate' or 'Science'");
  }
}

void ILoveScience() {
  println("What scientific aspect is more important to you?");
  String aspect = JOptionPane.showInputDialog("Is 'Flight' or 'Immortality' more important?");
  aspect = inputValidator(aspect, "Flight", "Immortality");
  
  
  if (aspect.equals("Flight")) {
    //do flight stuff
  } else if (aspect.equals("Immortality")) {
    //why do we care?
  } else {
    println("Invalid Option");
  }
}


//returnType functionName(parameters)
//GOAL: want to make sure they choose option1 or option2
String inputValidator(String response, String option1, String option2) {
  if (response.equals(option1) || response.equals(option2)) {
    return response;
  }
  while (!response.equals(option1) && !response.equals(option2)) {
    println("Invalid Option");
    println("Your options were '" +option1 + "' or '" + option2 + "'. Choose again");
    response = 
      JOptionPane.showInputDialog("Do you choose '" + option1 + "' or '" + option2 + "'?");
  }
  //If I make it here-> What do we know is true?
  //IT HAS to be option1 or option2
  return response;
  
}
