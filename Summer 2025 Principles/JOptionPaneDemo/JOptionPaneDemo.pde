import javax.swing.JOptionPane;

void setup(){
   String userInput = JOptionPane.showInputDialog("Enter a word");
   println("You typed: " + userInput);
   if (userInput.equals("hello")){
      println("Goodbye"); 
   } else if (userInput.equals("Bonjour")){
      println("Au Revoir"); 
   }
   int userNumber = int(JOptionPane.showInputDialog("Enter a whole number to be squared"));
   if (userNumber == 7){
      println("Lucky number Seven!"); 
   }
   int squared = userNumber*userNumber;
   println("Your number (" + userNumber + ") squared is: " + squared);
}
