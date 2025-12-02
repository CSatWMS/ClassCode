import javax.swing.JOptionPane;

void setup(){
   String secretWord = JOptionPane.showInputDialog("What word?");
   
   while (secretWord.length() != 5){
       secretWord = JOptionPane.showInputDialog("Wrong size. What word?");
   }
   
   for (int i = 0; i < secretWord.length(); i++){
      println("At index " + i + " the letter is: " + secretWord.charAt(i)); 
   }
}
