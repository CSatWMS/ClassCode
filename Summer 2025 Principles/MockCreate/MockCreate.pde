import javax.swing.JOptionPane;

void setup(){
  int secretNumber = (int) random(0, 100);
  IntList pastGuesses = new IntList();
  int guess = int(JOptionPane.showInputDialog("Enter a number between 0 and 100"));
  while (guess != secretNumber){
     if (alreadyGuessed(guess, pastGuesses)){
       println("You already guessed that!");
     } else if (guess > secretNumber){
        println("Your guess is too high"); 
        pastGuesses.append(guess);
     } else if (guess < secretNumber) {
        println("Your guess is too low!");
        pastGuesses.append(guess);
     }
     guess = int(JOptionPane.showInputDialog("Enter a number between 0 and 100"));
  }
  
  println("Hooray! You guessed it in " + pastGuesses.size() + " guesses");
  
}

boolean alreadyGuessed(int guess, IntList pastGuesses){
   for (int i = 0; i < pastGuesses.size(); i++){
      if (pastGuesses.get(i) == guess){
         return true; 
      }
   }
   return false;
}
