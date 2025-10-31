import javax.swing.JOptionPane;
void draw(){
  
}
void setup() {
  size(1000, 1247);
  int x = 0;
  while (x < 5) {
    print(x);
    x = x + 1;
  }
  //String favColor = JOptionPane.showInputDialog("What is your favorite color?");
  //println("Your favorite color is: " + favColor);
  println("You have arrived in a Spider Cave");
  println("You have strong opinions about spiders");
  String decision = JOptionPane.showInputDialog("Are you 'scared' like Ron or 'friends' like Hagrid?");
  while ( !decision.equals("scared") && !decision.equals("friends")) {
    println("Invalid choice");
    println("Your options are 'scared' or 'friends'");
    decision = JOptionPane.showInputDialog("Are you 'scared' like Ron or 'friends' like Hagrid?");
  }

  if (decision.equals("scared")) {
    println("You chose scared!");
    runOrFight();
  } else if (decision.equals("friends")) {
    println("You chose friends!");
  } else {
    println("Invalid Option");
  }
}

void runOrFight() {
  println("The spider is crawling toward you! What do you do?");
  println("Do you want to run away, or stay and fight?");
  String choice = JOptionPane.showInputDialog("Choose: 'run' or 'fight'");
  
  choice = inputChecker(choice, "run", "fight");
  
  if (choice.equals("run")) {
    println("You chose run");
    //either going to trip or cry
    if (random(1) < 0.5){
       println("Oops you tripped D:"); 
    } else {
      println("So sad, :''''''(((");
    }
  } else if (choice.equals("fight")) {
    println("You chose fight");
    float tester = random(1);
    if (tester < 1){
      println("As you try to fight, you panic and throw up");
      PImage photo = loadImage("ronbarfs.gif");
      image(photo, 0, 0);
    } else if (tester < 0.666666){
      println("In your attempt to fight, you pass out... oops.");
    } else {
      println("Bad news bears, you throw up and then pass out");
    }
  } else {
    println("Invalid");
  }
}


//returnType functionName(parameters)
String inputChecker(String input, String option1, String option2) {
  if (input.equals(option1) || input.equals(option2)) {
    return input;
  }
  while (!input.equals(option1) && !input.equals(option2)) {
    println("You have chosen poorly");
    println("Your options were '" + option1 + "' or '" + option2 + "' - pick one");
    input = JOptionPane.showInputDialog("Choose: '" + option1 + "' or '" + option2 + "'");
  }
  //if I make it here -> what MUST be true?
  return input;
  
}
