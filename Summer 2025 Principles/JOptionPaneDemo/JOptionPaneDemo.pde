import javax.swing.JOptionPane;

void setup(){
   String userInput = JOptionPane.showInputDialog("Enter a word");
   println("You typed: " + userInput);
   int userNumber = int(JOptionPane.showInputDialog("Enter a whole number to be squared"));
   int squared = userNumber*userNumber;
   println("Your number (" + userNumber + ") squared is: " + squared);
}
